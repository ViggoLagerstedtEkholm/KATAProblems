package com.company.solution_8kyu;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int free = 0;
        if(d >= 7){
            free = 50;
        }
        else if(d >= 3){
            free = 20;
        }

        return d * 40 - free;
    }
}
