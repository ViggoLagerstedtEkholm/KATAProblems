package com.company;

public class HumanReadableTIme {
    public String makeReadable(int seconds) {
        int sec = seconds % 60;
        int min = (seconds % 3600 ) / 60;
        int hours = seconds / 3600;

        return String.format("%02d:%02d:%02d", hours, min, sec);
    }
}
