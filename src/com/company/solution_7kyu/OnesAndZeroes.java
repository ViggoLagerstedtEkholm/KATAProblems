package com.company.solution_7kyu;

import java.util.List;

public class OnesAndZeroes {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int multiplier = 1;
        int sum = 0;
        for(int i = binary.size() - 1; i >= 0; i--){
            if(binary.get(i) == 1){
                sum += multiplier;
            }
            multiplier = multiplier * 2;
        }

        return sum;
    }
}
