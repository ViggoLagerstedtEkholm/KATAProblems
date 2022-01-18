package com.company.solution_8kyu;

public class ClockMilli {
    public static int Past(int h, int m, int s)
    {
        int milliHours = h * 60 * 60 * 1000;
        int milliMinutes = m * 60 * 1000;
        int milliSeconds = s * 1000;

        return milliHours + milliMinutes + milliSeconds;
    }
}
