package com.company.solution_4kyu;

import java.awt.*;

public class Snail {
    enum Direction {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        if (array.length == 1) return new int[] {array[0][0]};

        Direction direction = Direction.EAST;
        int totalSquares = array.length * array.length;
        int[] result = new int[totalSquares];
        boolean[][] visited = new boolean[array[0].length][array.length];

        //Start square (0, 0) will be visited and added to the result.
        visited[0][0] = true;
        result[0] = array[0][0];

        Point position = new Point(0, 0);
        int index = 1;
        boolean done = false;

        while (!done) {
            direction = checkForDirectionChange(position, visited, array, direction);
            move(position, index, result, visited, array, direction);
            done = isDone(visited);
            index++;
        }

        return result;
    }

    private static Direction checkForDirectionChange(Point position, boolean[][] visited, int[][] squares, Direction currentDir) {
        int colXPos = (int) position.getX();
        int rowYPos = (int) position.getY();

        int rows = squares[0].length - 1;
        int cols = squares.length - 1;

        Direction newDir = currentDir;

        switch (currentDir) {
            case NORTH:
                //Check if the square to the north is our of bounds (we are at the upper most square) or the square above is already visited.
                boolean invalidUpSquare = rows - rowYPos == rows;
                if (invalidUpSquare || visited[rowYPos - 1][colXPos]) {
                    newDir = Direction.EAST;
                }
                break;
            case SOUTH:
                //Check if the square to the south is our of bounds (we are at the bottom square) or the square below is already visited.
                boolean invalidDownSquare = rows - rowYPos == 0;
                if (invalidDownSquare || visited[rowYPos + 1][colXPos]) {
                    newDir = Direction.WEST;
                }
                break;
            case EAST:
                //Check if the square to the right is our of bounds (we are at the right most square) or the square to the right is already visited.
                boolean invalidRightSquare = cols - colXPos == 0;
                if (invalidRightSquare || visited[rowYPos][colXPos + 1]) {
                    newDir = Direction.SOUTH;
                }
                break;
            case WEST:
                //Check if the square to the left is our of bounds (we are at the right most square) or the square to the right is already visited.
                boolean invalidLeftSquare = cols - colXPos == cols;
                if (invalidLeftSquare || visited[rowYPos][colXPos - 1]) {
                    newDir = Direction.NORTH;
                }
                break;
        }

        return newDir;
    }

    private static void move(Point position, int index, int[] result, boolean[][] visited, int[][] squares, Direction direction) {
        int colXPos = (int) position.getX();
        int rowYPos = (int) position.getY();

        switch (direction) {
            case NORTH:
                visited[rowYPos - 1][colXPos] = true;
                result[index] = squares[rowYPos - 1][colXPos];
                position.setLocation(colXPos, rowYPos - 1);
                break;
            case SOUTH:
                visited[rowYPos + 1][colXPos] = true;
                result[index] = squares[rowYPos + 1][colXPos];
                position.setLocation(colXPos, rowYPos + 1);
                break;
            case EAST:
                visited[rowYPos][colXPos + 1] = true;
                result[index] = squares[rowYPos][colXPos + 1];
                position.setLocation(colXPos + 1, rowYPos);
                break;
            case WEST:
                visited[rowYPos][colXPos - 1] = true;
                result[index] = squares[rowYPos][colXPos - 1];
                position.setLocation(colXPos - 1, rowYPos);
                break;
        }
    }

    private static boolean isDone(boolean[][] visited) {
        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited[0].length; col++) {
                if (!visited[row][col]) return false;
            }
        }
        return true;
    }
}
