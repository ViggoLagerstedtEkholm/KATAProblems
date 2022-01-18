package com.company.solution_7kyu;

public class RegExPIN {
    public static boolean validatePin(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}
