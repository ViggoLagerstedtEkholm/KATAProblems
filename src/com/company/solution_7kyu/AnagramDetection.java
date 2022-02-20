package com.company.solution_7kyu;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if(test.length() != original.length()) return false;

        test = test.toLowerCase();
        original = original.toLowerCase();

        char[] testChars = test.toCharArray();
        char[] originalChars = original.toCharArray();

        Map<Character,Integer> testCharsCounter = new LinkedHashMap<>();
        Map<Character,Integer> originalCharsCounter = new LinkedHashMap<>();

        for (char v : testChars) {
            testCharsCounter.putIfAbsent(v, 0);
            testCharsCounter.put(v, testCharsCounter.get(v) + 1);
        }

        for (char v : originalChars) {
            originalCharsCounter.putIfAbsent(v, 0);
            originalCharsCounter.put(v, originalCharsCounter.get(v) + 1);
        }

        for(Character character : testCharsCounter.keySet()){
            if(originalCharsCounter.get(character) == null){
                return false;
            }

            if(!Objects.equals(testCharsCounter.get(character), originalCharsCounter.get(character))){
                return false;
            }
        }

        return true;
    }
}
