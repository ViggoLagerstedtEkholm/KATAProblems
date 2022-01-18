package com.company.solution_6kyu;

public class DecodeMorse {
    public static String decode(String morseCode) {
        //every 3 spaces is a new word.
        String[] words = morseCode.split("   ");
        StringBuilder decoded = new StringBuilder();

        for(String word : words){
            String[] letters = word.split(" ");
            StringBuilder createWord = new StringBuilder();
            for(String letter : letters){
                createWord.append(DecodeMorse.decode(letter));
            }
            decoded.append(createWord.toString());
        }

        return decoded.toString();
    }
}
