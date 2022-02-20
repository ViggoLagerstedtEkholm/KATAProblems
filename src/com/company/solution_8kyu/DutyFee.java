package com.company.solution_8kyu;

public class DutyFee {
    public static int dutyFree(int normPrice, int discount, int hol) {
        int savings = 0;
        int amount = 0;
        while(savings < hol){
            savings += normPrice - (normPrice * (discount / 100.0));
            amount++;
        }
        return amount - 1;
    }
}
