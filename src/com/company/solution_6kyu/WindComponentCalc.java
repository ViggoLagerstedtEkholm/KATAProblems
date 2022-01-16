package com.company.solution_6kyu;

public class WindComponentCalc {
    public static String message(String rwy, int windDirection,int windSpeed) {
        double angleInRadians = Math.toRadians(Integer.parseInt(rwy.substring(0, 2)) * 10 - windDirection);
        int headWind = headWind(angleInRadians, windSpeed);
        int crossWind = crossWind(angleInRadians, windSpeed);
        String headOrTail = headWind >= 0 ? "Head" : "Tail";
        String leftOrRight = crossWind > 0 ? "left" : "right";
        return formatString(headWind, crossWind, headOrTail, leftOrRight);
    }

    private static String formatString(int headWind, int crossWind, String headOrTail, String leftOrRight){
        return headOrTail + "wind " + Math.abs(headWind) + " knots. Crosswind " + Math.abs(crossWind) + " knots from your " + leftOrRight + ".";
    }

    private static int crossWind(double angle, int windSpeed){
        return (int) Math.round(Math.sin(angle) * windSpeed);
    }


    private static int headWind(double angle, int windSpeed){
        return (int) Math.round(Math.cos(angle) * windSpeed);
    }
}
