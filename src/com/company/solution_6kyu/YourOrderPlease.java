package com.company.solution_6kyu;

import java.util.HashMap;
import java.util.Map;

public class YourOrderPlease {
    public static String order(String words) {
        if(words.isEmpty()) return "";
        String[] positions = words.split(" ");
        Map<Integer, String> positionInStrings = new HashMap<>();

        for(String word : positions){
            int value = Integer.parseInt(word.replaceAll("[^0-9]", ""));
            positionInStrings.put(value, word);
        }

        StringBuilder finalWord = new StringBuilder();
        for (Map.Entry<Integer, String> entry : positionInStrings.entrySet()){
            finalWord.append(entry.getValue()).append(" ");
        }

        return finalWord.toString().trim();
    }
}
