package com.company.solution_6kyu;

import java.util.HashSet;
import java.util.Iterator;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        HashSet<String> set = new HashSet<>();
        char[] chars = text.toLowerCase().toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c1 = chars[i];
            for(int j = 0; j < chars.length; j++){
                char c2 = chars[j];
                if(c1 == c2 && i != j) set.add(String.valueOf(c2));
            }
        }

        for (String character : set) {
            System.out.println(character);
        }

        return set.size();
    }

    public static int duplicateCountAlt(String text) {
        // Write your code here
        HashSet<Character> set = new HashSet<>();
        char[] chars = text.toLowerCase().toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c1 = chars[i];
            for(int j = i + 1; j < chars.length; j++){
                char c2 = chars[j];
                if(c1 == c2) set.add(c2);
            }
        }

        return set.size();
    }
}
