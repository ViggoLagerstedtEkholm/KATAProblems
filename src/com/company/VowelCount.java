package com.company;

import java.util.Arrays;

public class VowelCount {
    public int getCount(String str) {
        int count = 0;
        String vowels = "aeiou";

        //Check if each character in the string matches the vowels.
        for (char character : str.toCharArray()) {

            //Vowel was found if it's not -1.
            if (vowels.indexOf(character) != -1) {
                count++;
            }
        }

        return count;
    }
}
