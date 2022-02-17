package com.company.solution_8kyu;

public class Digitalize {
    public static int[] digitize(long n) {
        String[] values = String.valueOf(n).split("");
        int[] reversed = new int[values.length];

        int index = 0;
        for(int i = values.length - 1; i >= 0; i--){
            reversed[index] = Integer.parseInt(values[i]);
            index++;
        }
        return reversed;
    }
}
