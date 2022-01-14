package com.company;

import java.util.HashMap;

public class MultiTap {
    HashMap<Integer, String[]> keys = new HashMap<>();

    public int presses(String phrase) {
        //Allow any input, either uppercase or lowercase.
        String formatted = phrase.toUpperCase();

        keys.put(1, new String[]{"1"});
        keys.put(2, new String[]{"A", "B", "C", "2"});
        keys.put(3, new String[]{"D", "E", "F", "3"});
        keys.put(4, new String[]{"G", "H", "I", "4"});
        keys.put(5, new String[]{"J", "K", "L", "5"});
        keys.put(6, new String[]{"M", "N", "O", "6"});
        keys.put(7, new String[]{"P", "Q", "R", "S", "7"});
        keys.put(8, new String[]{"T", "U", "V", "8"});
        keys.put(9, new String[]{"W", "X", "Y", "Z", "9"});
        keys.put(0, new String[]{" ", "0"});

        String[] characters = formatted.split("");

        int totalSteps = 0;
        //Calculate the total amount of steps for each character and add it to totalSteps.
        for (String word : characters) {
            int calculatedSteps = steps(word);
            totalSteps += calculatedSteps;
        }

        return totalSteps;
    }

    private int steps(String letter){
        int totalStepCount = 0;

        //Handle special characters. (1 step only)
        if(letter.equals("#") || letter.equals("*")){
            return 1;
        }

        //Handle deep characters steps. (1 or more steps)
        for (String[] value : keys.values()) {
            int steps = 0;

            for (String stringInSelection : value) {
                steps++;
                if (stringInSelection.equals(letter)) {
                    totalStepCount = steps;
                }
            }
        }

        return totalStepCount;
    }
}
