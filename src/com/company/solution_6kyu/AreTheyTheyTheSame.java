package com.company.solution_6kyu;

import java.util.Arrays;

public class AreTheyTheyTheSame {
    public boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        Arrays.sort(a); //sort A
        Arrays.sort(b); //sort B

        //The arrays are the same size, we only need one loop when they are sorted.
        for(int i = 0; i < a.length; i++)
        {
            int squaredAtIndexA = a[i] * a[i];
            int valueAtIndexB = b[i];

            if(squaredAtIndexA != valueAtIndexB){
                return false;
            }
        }

        return true;
    }
}
