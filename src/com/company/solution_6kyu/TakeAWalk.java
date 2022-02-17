package com.company.solution_6kyu;

import java.awt.*;

public class TakeAWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        Point pos = new Point(0, 0);
        int time = 0;

        for(char direction : walk){
            move(direction, pos);
            time++;

            if(time == 10){
                return checkIfOnTime(pos);
            }
        }

        return true;
    }

    private static boolean checkIfOnTime(Point pos){
        if(pos.getX() == 0 && pos.getY() == 0){
            return true;
        }else{
            return false;
        }
    }

    private static void move(char dir, Point pos){
        int X = (int) pos.getX();
        int Y = (int) pos.getY();

        switch(dir){
            case 'n': pos.setLocation(X, Y + 1); break;
            case 's': pos.setLocation(X, Y - 1); break;
            case 'e': pos.setLocation(X - 1, Y); break;
            case 'w': pos.setLocation(X + 1, Y ); break;
        }
    }
}
