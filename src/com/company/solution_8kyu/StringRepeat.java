package com.company.solution_8kyu;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(string).repeat(Math.max(0, repeat)));
        return result.toString();
    }
}
