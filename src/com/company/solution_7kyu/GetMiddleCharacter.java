package com.company.solution_7kyu;

public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        int len = word.length();
        int middle = len / 2;
        if(len % 2 == 0){
            return word.substring(middle - 1, middle + 1);
        }else{
            return word.substring(middle, middle + 1);
        }
    }
}
