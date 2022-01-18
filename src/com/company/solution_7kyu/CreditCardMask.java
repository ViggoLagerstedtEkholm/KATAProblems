package com.company.solution_7kyu;

public class CreditCardMask {
    public static String maskify(String str) {
        char[] chars = str.toCharArray();
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.length() - i > 4){
                chars[i] = '#';
            }
        }

        return String.valueOf(chars);
    }
}
