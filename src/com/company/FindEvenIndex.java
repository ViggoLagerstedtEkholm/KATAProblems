package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenIndex {
    public int findEvenIndex(int[] arr) {
        int left = 0;
        int right = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++){
            right -= arr[i];
            if (left == right) return i;
            left += arr[i];
        }
        return -1;
    }
}
