package com.company;

public class Square {
    public int squareDigits(int n) {
        StringBuilder total = new StringBuilder();
        String[] values = Integer.toString(n).split("");

        for(int i = 0; i < values.length; i++){
            String valueAtIndex = values[i];
            int convertedVal = Integer.parseInt(valueAtIndex);
            total.append(convertedVal * convertedVal);
        }

        return Integer.parseInt(total.toString());
    }
}
