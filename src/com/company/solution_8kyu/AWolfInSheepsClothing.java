package com.company.solution_8kyu;

public class AWolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {
        int index = array.length;
        for(String s : array){
            System.out.println("Index: " +index + " : " + s);
            if(s.equals("wolf")) break;
            index--;
        }
        System.out.println("WOLF IS AT INDEX: " +index);

        if(index == 1) return "Pls go away and stop eating my sheep";
        return "Oi! Sheep number "+(index -1)+"! You are about to be eaten by a wolf!";
    }
}
