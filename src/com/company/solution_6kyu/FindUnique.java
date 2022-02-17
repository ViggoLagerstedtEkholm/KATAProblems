package com.company.solution_6kyu;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUnique {
    public static double findUniq(double arr[]) {
        Map<Double,Integer> hashmap = new LinkedHashMap<>();
        double unique = 0.0;

        for (double v : arr) {
            hashmap.putIfAbsent(v, 0);
            hashmap.put(v, hashmap.get(v) + 1);
        }

        int max = Collections.max(hashmap.values());

        for (Map.Entry<Double,Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() != max) {
                unique = entry.getKey();
                break;
            }
        }

        return unique;
    }
}
