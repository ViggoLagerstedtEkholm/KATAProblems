package com.company;

public class PerfectSquare {
    public long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);

        //Check if it is a perfect square. If it's not whole, it's not a perfect square.
        if(sqrt % 1 != 0){
            return -1;
        }

        //Take the current perfect square and add 1 to it, this will be the next perfect square available.
        int nextBest = (int) sqrt + 1;

        //Finally, square the next best perfect square.
        return (long) nextBest * nextBest;
    }
}
