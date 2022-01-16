package com.company.solution_6kyu;

public class StreetFighter2Characters {
    public String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        //The amount of characters is already specified by the amount of movies, 1 move = 1 character.
        String[] charactersHovered = new String[moves.length];

        //position has two values [x, y].
        int startX = position[0];
        int startY = position[1];

        int index = 0;
        for (String selectedMove : moves) {

            //Move according to the rules.
            switch (selectedMove) {
                case "right":
                    if (startX == 5) {
                        startX = 0;
                    } else {
                        startX += 1;
                    }
                    break;
                case "left":
                    if (startX == 0) {
                        startX = 5;
                    } else {
                        startX -= 1;
                    }
                    break;
                case "down":
                    if (startY != 1) {
                        startY = 1;
                    }
                    break;
                case "up":
                    if (startY != 0) {
                        startY = 0;
                    }
                    break;
            }

            //Get the character at the x and y coordinate. Add this character to the array of hovered characters.
            charactersHovered[index] = fighters[startY][startX];
            index++;
        }

        return charactersHovered;
    }
}
