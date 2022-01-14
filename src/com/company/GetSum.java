package com.company;

public class GetSum {
    public int getSum(int a, int b)
    {
        if(a == b){
            return a;
        }

        if (a > b){
            return a + getSum(a - 1,b);
        } else {
            return a + getSum(a + 1, b);
        }
    }
}
