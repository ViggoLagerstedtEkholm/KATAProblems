package com.company.solution_8kyu;

import java.util.StringJoiner;

public class CountingSheep {
    public static String countingSheep(int num) {
        //Add your code here
        StringJoiner stringJoiner = new StringJoiner(" ");
        for(int i = 0; i < num; i++){
            stringJoiner.add(i + 1 + " sheep...");
        }
        return stringJoiner.toString();
    }
}
