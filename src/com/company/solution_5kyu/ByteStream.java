package com.company.solution_5kyu;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

class ByteStream {
    private enum MODE{
        READ,
        WRITE,
        IDLE
    }

    private ByteBuffer byteBuffer = ByteBuffer.allocate(1000000000);
    private MODE mode = MODE.IDLE;

    /**
     * Flip stream between write and read mode.
     * Before the first call of this method, the stream is neither in read nor write mode.
     * The first call of this method switches the stream to write mode.
     * After a switch to write mode, the stream is empty and bytes may be written.
     * After a switch to read mode, written bytes may be read.
     * @throws IOException if an I/O error occurs
     */
    public void flip() throws IOException {
        switch (mode){
            case READ:
            case IDLE:
                mode = MODE.WRITE;
                byteBuffer.clear();
                break;
            case WRITE:
                mode = MODE.READ;
                byteBuffer.flip();
                break;
        }
    }

    /**
     * Write byte to stream.
     * @param b byte
     * @throws IOException if stream is not in write mode or an I/O error occurs
     */
    public void write(byte b) throws IOException {
        if(mode != MODE.WRITE){
            throw new IOException("READ MODE IS ACTIVATED ON WRITE.");
        }
        byteBuffer.put(b);
    }

    /**
     * Read byte from stream.
     * @return -1 if stream is empty, byte value (0 to 255) otherwise
     * @throws IOException if stream is not in read mode or an I/O error occurs
     */
    public int read() throws IOException {
        if(mode != MODE.READ){
            throw new IOException("WRITE MODE IS ACTIVATED ON READ.");
        }

        try{
            return byteBuffer.get() & 0xff;
        }catch (BufferUnderflowException io){
            return -1;
        }
    }
}