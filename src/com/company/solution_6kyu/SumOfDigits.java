package com.company.solution_6kyu;

public class SumOfDigits {
    public static int digital_root(int n) {
        String number = Integer.toString(n);
        String[] numbers = number.split("");
        int sum = 0;

        for(String numberAtIndex : numbers){
            int val = Integer.parseInt(numberAtIndex);
            sum += val;
        }

        String numberEnd = Integer.toString(sum);

        if(numberEnd.length() >= 2){
            return digital_root(sum);
        }

        return sum;
    }
}
