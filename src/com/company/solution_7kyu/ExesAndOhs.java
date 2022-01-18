package com.company.solution_7kyu;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        char[] chars = str.toLowerCase().toCharArray();

        int oCount = 0;
        int xCount = 0;

        for(char c : chars){
            if(c == 'o') oCount++;
            if(c == 'x') xCount++;
        }

        return oCount == xCount;
    }
}
