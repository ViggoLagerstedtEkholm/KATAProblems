package com.company.solution_7kyu;

import java.util.Arrays;

public class LargestSumPair {
    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}
