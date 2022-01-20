package com.company.solution_7kyu;

public class PrinterErrors {
    public static String printerError(String s) {
        char[] characters = s.toCharArray();
        int toEndChar = 'm';
        int error = 0;
        int total = s.length();

        for(char character : characters){
            int m = Integer.parseInt(String.valueOf(toEndChar));
            if(character > m) error++;
        }

        return error + " / " + total;
    }
}
