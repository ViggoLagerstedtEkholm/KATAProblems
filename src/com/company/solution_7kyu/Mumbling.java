package com.company.solution_7kyu;

import java.util.Locale;
import java.util.StringJoiner;

public class Mumbling {
    public static String accum(String s) {
        char[] chars = s.toCharArray();
        String mumble = "";
        StringJoiner stringJoiner = new StringJoiner("-");

        for(int i = 0 ; i < chars.length; i++){
            char c = chars[i];
            StringBuilder mumbleOnChar = new StringBuilder();
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    mumbleOnChar.append(String.valueOf(c).toUpperCase());
                }else{
                    mumbleOnChar.append(String.valueOf(c).toLowerCase());
                }
            }

            stringJoiner.add(mumbleOnChar);
        }

        return stringJoiner.toString();
    }
}
