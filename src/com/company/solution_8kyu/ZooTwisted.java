package com.company.solution_8kyu;

public class ZooTwisted {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] sorted = new String[3];

        sorted[0] = arr[2];
        sorted[1] = arr[1];
        sorted[2] = arr[0];

        return sorted;
    }
}
