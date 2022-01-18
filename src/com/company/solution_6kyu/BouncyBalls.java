package com.company.solution_6kyu;

public class BouncyBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h || window <= 0) {
            return -1;
        }

        int seen = -1;
        while(h > window){
            h *= bounce;
            seen += 2;
        }
        // your code
        return seen;
    }
}
