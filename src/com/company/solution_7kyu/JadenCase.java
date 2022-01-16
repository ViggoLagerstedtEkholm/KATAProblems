package com.company.solution_7kyu;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase.isEmpty()){
            return null;
        }
        String[] characters = phrase.split(" ");
        StringBuilder newString = new StringBuilder();

        for (String segment : characters) {
            String capitalized = segment.substring(0, 1).toUpperCase() + segment.substring(1);
            newString.append(capitalized).append(" ");
        }

        return newString.toString().trim();
    }
}
