package com.company.solution_7kyu;

import java.util.StringJoiner;

public class ReverseWords {
    public static String reverseWords(final String sentence)
    {
        if(sentence.isBlank()) return sentence;

        String[] words = sentence.split(" ");
        StringJoiner join = new StringJoiner(" ");

        for(String test : words){
            System.out.println("WORD: " +test);

            join.add(new StringBuilder(test).reverse().toString());
        }

        return join.toString();
    }
}
