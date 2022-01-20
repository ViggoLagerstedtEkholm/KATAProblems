package com.company.solution_7kyu;

import java.util.StringJoiner;

public class ExclamationMarksSeries {
    public static String removeBang(String str) {
        String[] words = str.split(" ");

        StringJoiner stringJoiner = new StringJoiner(" ");

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            StringBuilder wordSB = new StringBuilder(word);

            for(int j = word.length() - 1; i >= 0; i--) {
                if(wordSB.charAt(j) == '!'){
                    wordSB.deleteCharAt(j);
                }else{
                    break;
                }
            }

            stringJoiner.add(wordSB);
        }

        return stringJoiner.toString();
    }
}
