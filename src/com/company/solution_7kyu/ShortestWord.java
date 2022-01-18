package com.company.solution_7kyu;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();

        for (String word : words) {
            int length = word.length();
            if (length <= min) {
                min = length;
            }
        }

        return min;
    }
}
