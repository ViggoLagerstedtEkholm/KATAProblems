package com.company.solution_8kyu;

public class ReverseSeq {
    public static int[] reverse(int n){
        int[] reversed = new int[n];

        int index = 0;
        for(int i = n - 1; n >= 0; i--){
            reversed[index++] = i;
        }

        return reversed;
    }
}
