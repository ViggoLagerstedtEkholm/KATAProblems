package com.company.solution_6kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> substrings = new ArrayList<>();
        for (String test : array1) {
            System.out.println("A: " + test);
        }

        System.out.println();

        for (String test : array2) {
            System.out.println("B: " + test);
        }

        for (String a1 : array1) {
            for (String a2 : array2) {
                if (a2.contains(a1)) {
                    if(!substrings.contains(a1)){
                        substrings.add(a1);
                    }
                }
            }
        }

        String[] array = new String[substrings.size()];
        substrings.stream().sorted().collect(Collectors.toList()).toArray(array);
        return array;
    }
}
