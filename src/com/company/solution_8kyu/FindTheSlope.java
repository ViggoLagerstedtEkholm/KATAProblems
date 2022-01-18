package com.company.solution_8kyu;

public class FindTheSlope {
    public String slope(int[] points)
    {
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];
        if(x2 - x1 == 0) return "undefined";
        int slope = (y2 - y1) / (x2 - x1);
        return String.valueOf(slope);
    }
}
