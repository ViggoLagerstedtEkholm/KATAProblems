package com.company.solution_7kyu;

public class ScoringTests {
    public static int sol(int[] arr, int r, int o, int w){
        int numberOfCorrect = 0;
        int numberOfOmitted = 0;
        int numberOfWrong = 0;

        for(int i = 0; i < arr.length; i++){
            int numberAtIndex = arr[i];
            if(numberAtIndex == 0) numberOfCorrect++;
            if(numberAtIndex == 1) numberOfOmitted++;
            if(numberAtIndex == 2) numberOfWrong++;
        }

        System.out.println("numberOfCorrect: " + numberOfCorrect);
        System.out.println("numberOfOmitted: " + numberOfOmitted);
        System.out.println("numberOfWrong: " + numberOfWrong);

        int points = numberOfCorrect * r;
        points += numberOfOmitted * o;
        points += numberOfWrong * w;

        return points;
    }
}
