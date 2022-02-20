package com.company.solution_6kyu;

import java.util.StringJoiner;

public class EncryptThis {
    public static String encryptThis(String text) {
        if(text.length() == 0) return "";
        String[] words = text.split(" ");
        StringJoiner sj = new StringJoiner(" ");

        for(String word : words){
            String[] characters = word.split("");

            String ASCII = String.valueOf((int) characters[0].charAt(0));
            characters[0] = ASCII;

            if(characters.length > 1){
                String secondLetter = characters[1];
                String lastLetter = characters[characters.length - 1];

                characters[1] = lastLetter;
                characters[characters.length - 1] = secondLetter;
            }


            StringBuilder sb = new StringBuilder();

            for(String character : characters){
                sb.append(character);
            }

            sj.add(sb.toString());
        }

        return sj.toString();
    }
}
