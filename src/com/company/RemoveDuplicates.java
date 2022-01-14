package com.company;

public class RemoveDuplicates {
    public String removeConsecutiveDuplicates(String s){
        //Regex is your friend.
        return s.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
    }
}
