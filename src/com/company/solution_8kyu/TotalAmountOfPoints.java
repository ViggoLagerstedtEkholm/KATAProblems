package com.company.solution_8kyu;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int points = 0;

        for(String game : games){
            String[] score = game.split(":");
            String x = score[0];
            String y = score[1];

            int xScore = Integer.parseInt(x);
            int YScore = Integer.parseInt(y);

            if(xScore > YScore) points += 3;
            if(xScore < YScore) points += 0;
            if(xScore == YScore) points += 1;
        }

        return points;
    }
}
