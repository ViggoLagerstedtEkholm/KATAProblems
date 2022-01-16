package com.company.solution_8kyu;


import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Flip {

    //Refactor later.
    public int[] Flip(char dir, int[] arr)
    {
        Integer[] array = Arrays.stream( arr ).boxed().toArray( Integer[]::new );

        switch(dir){
            case 'R':
                Arrays.sort(array, Collections.reverseOrder());
                break;
            case 'L':
                Arrays.sort(array);
                break;
        }

        int[] example1 = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

        switch(dir){
            case 'R': bubbleSortAscending(arr);
                break;
            case 'L': bubbleSortDescending(arr);
                break;
        }

        return arr;
    }

    private void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
