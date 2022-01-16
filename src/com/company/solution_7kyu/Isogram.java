package com.company.solution_7kyu;

import java.util.Arrays;

public class Isogram {
    public static boolean isIsogram(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i < chars.length - 1; i++){
            System.out.println(i + " : " + chars[i]);
            int charA = chars[i];
            int charB = chars[i + 1];

            if(charA == charB && !Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
