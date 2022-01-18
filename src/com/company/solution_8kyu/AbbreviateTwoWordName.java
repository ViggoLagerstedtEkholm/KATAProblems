package com.company.solution_8kyu;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        StringBuilder shortName = new StringBuilder();

        for(String part : names){
            shortName.append(part.substring(0, 1)).append(" ");
        }

        return shortName.toString().trim().toUpperCase().replace(" ", ".");
    }
}
