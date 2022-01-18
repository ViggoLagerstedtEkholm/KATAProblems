package com.company.solution_5kyu;

import java.util.Stack;

public class DirectionReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        Stack<String> moves = new Stack<>();

        for (String direction : arr) {
            if(!moves.empty()){
                String topItem = moves.peek();
                if(getOpposite(topItem).equals(direction)){
                    moves.pop();
                }else{
                    moves.add(direction);
                }
            }else{
                moves.add(direction);
            }
        }

        return moves.toArray(new String[]{});
    }

    private static String getOpposite(String direction){
        switch (direction){
            case "NORTH": return "SOUTH";
            case "SOUTH": return "NORTH";
            case "EAST": return "WEST";
            case "WEST":return "EAST";
            default: return "ERROR";
        }
    }
}
