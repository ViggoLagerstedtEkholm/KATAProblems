package com.company.solution_8kyu;

public class CenturyFromYear {
    public static int century(int number) {
        double year = number / 100;
        System.out.println(Math.ceil(year));
        return (int) Math.ceil(year);
    }
}
