package com.company.solution_6kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> odd = new ArrayList<>();

        //Find the odd values and add them to the naughty list of odd integers.
        for (int j : array) {
            if (j % 2 == 1) {
                odd.add(j);
            }
        }

        //Sort the odd list.
        odd = odd.stream().sorted().collect(Collectors.toList());

        //Go through the original array and find the odd values again, but this time replace them with the new sorted.
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                array[i] = odd.get(index++);
            }
        }

        return array;
    }
}
