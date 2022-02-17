package com.company.solution_6kyu;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class DeleteOccurencesOverNth {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<Integer> fininalized = new ArrayList<>();
        Map<Integer, Integer> valueAndOccurrence = new HashMap<>();

        for (int n : elements) {
            valueAndOccurrence.putIfAbsent(n, 0);

            if(valueAndOccurrence.get(n) < maxOccurrences){
                fininalized.add(n);
                valueAndOccurrence.put(n, valueAndOccurrence.get(n) + 1);
            }
        }

        for(Integer value : fininalized){
            System.out.println("Value: " + value);
        }

        return fininalized.stream().mapToInt(i -> i).toArray();
    }
}
