package com.company.solution_8kyu;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int max = numbers[numbers.length - 1];
        int min = numbers[0];

        int diff = Math.abs(max - min) + 1;
        int[] pipes = new int[diff];

        int index = 0;
        for(int i = min; i <= max; i++){
            pipes[index++] += i;
        }

        return pipes;
    }
}
