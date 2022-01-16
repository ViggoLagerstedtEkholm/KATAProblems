package com.company.solution_7kyu;

public class RemoveConsecutiveDuplicateWords {
    public static String removeConsecutiveDuplicates(String s){
        //Regex is your friend.
        return s.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
    }
}
