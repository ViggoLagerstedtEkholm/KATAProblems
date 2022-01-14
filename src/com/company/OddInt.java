package com.company;

public class OddInt {
    public static int findIt(int[] a) {
        //Loop through array.
        for (int valAtIndexA : a) {
            int count = 0;

            //For each value of the outer loop, go through the inner loop to find all occurences of the value at index i.

            for (int valAtIndexB : a) {
                if (valAtIndexA == valAtIndexB) {
                    count++;
                }
            }

            //After we have gotten the sum of all the occurrences we check if it's odd.
            if (count % 2 != 0) {
                //return the value at the index i.
                return valAtIndexA;
            }
        }

        //No odd value found.
        return -1;
    }
}
