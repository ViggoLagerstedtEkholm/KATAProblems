package com.company.solution_8kyu;

public class FindTheFirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        if(array.length == 0 || array.length == 1) return null;
        for(int i = 1; i < array.length; i++){
            int x1 = array[i - 1];
            int x2 = array[i];
            int diff = Math.abs(x1 - x2);
            if(diff > 1) return x2;
        }
        return null;
    }
}
