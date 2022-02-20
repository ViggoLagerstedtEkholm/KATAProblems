package com.company.solution_6kyu;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class LongestConsecutiveRepetition {
    public static Object[] longestRepetition(String s) {
        if(s.isEmpty()) return new Object[]{"", 0};

        String[] characters = s.split("");

        int iterator = 0;
        String previousCharacter = characters[0];

        String highestCharacter = characters[0];
        int highestInSequence = 0;

        for (String character : characters) {
            if (character.equals(previousCharacter)) {
                ++iterator;
            }else{
                iterator = 1;
            }

            if (iterator > highestInSequence) {
                highestInSequence = iterator;
                highestCharacter = character;
            }

            previousCharacter = character;
        }

        return new Object[]{highestCharacter, highestInSequence};
    }
}
