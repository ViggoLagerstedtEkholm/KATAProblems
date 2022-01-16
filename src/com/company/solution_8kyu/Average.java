package com.company.solution_8kyu;

public class Average {
    public static double find_average(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }
}
