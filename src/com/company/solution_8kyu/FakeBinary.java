package com.company.solution_8kyu;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] chars = numberString.split("");
        StringBuilder binary = new StringBuilder();
        for(String character : chars){
            if(Integer.parseInt(character) < 5) binary.append("0");
            if(Integer.parseInt(character) >= 5) binary.append("1");
        }
        return binary.toString();
    }
}
