package com.company.solution_5kyu;

import java.util.ArrayList;
import java.util.List;

class Ship {
    private int X;
    private int Y;
    private Direction direction;
    enum Direction{
        NORTH,
        SOUTH,
        EAST
    }

    public Ship(int width, int height, Direction direction) {
        this.X = width;
        this.Y = height;
        this.direction = direction;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

public class EscapeWithYourBooty {
    public static boolean checkCourse(char[][] map) {
        Ship shipWithGoodies = getShipStartPosition(map);
        List<Ship> navy = getNavyPositions(map);

        while(true){
            moveNavy(navy, map);
            moveShipWithGoodies(shipWithGoodies, map);
            printSea(map);
            if(isCaught(map, shipWithGoodies)) return false;
            if(isSuccessful(map, shipWithGoodies)) return true;
        }
    }

    private static void moveShipWithGoodies(Ship shipWithGoodies, char[][] map){
        shipWithGoodies.setX(shipWithGoodies.getX() + 1);
        int X = shipWithGoodies.getX();
        int Y = shipWithGoodies.getY();

        System.out.println("X: " + X);
        System.out.println("Y: " + Y);

        map[Y][X] = 'X';
        map[Y][X - 1] = '0';
    }

    private static void moveNavy(List<Ship> navy, char[][] map){
        for(Ship ship : navy){
            int Y = ship.getY();
            int X = ship.getX();

            //Turn if necessary.
            switch (ship.getDirection()){
                case NORTH:
                    if(Y == 0){
                        ship.setDirection(Ship.Direction.SOUTH);
                    }
                    break;
                case SOUTH:
                    if(Y == map.length - 1){
                        ship.setDirection(Ship.Direction.NORTH);
                    }
                    break;
            }

            //Move in the specified direction.
            switch (ship.getDirection()){
                case SOUTH:
                    ship.setY(ship.getY() + 1);
                    int updatedSouthY = ship.getY();
                    map[Y][X] = 'O';
                    map[updatedSouthY][X] = 'N';
                break;
                case NORTH:
                    ship.setY(ship.getY() - 1);
                    int updatedNorthY = ship.getY();
                    map[Y][X] = 'O';
                    map[updatedNorthY][X] = 'N';
                break;
            }
        }
    }

    private static boolean isSuccessful(char[][] map, Ship shipWithGoodies){
        int width = map[0].length - 1;
        return shipWithGoodies.getX() == width;
    }

    private static Ship getShipStartPosition(char[][] map){
        Ship position = null;

        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[0].length; col++){
                char charAtIndex = map[row][col];
                if(charAtIndex == 'X'){
                    position = new Ship(col, row, Ship.Direction.EAST);
                    break;
                }
            }
        }

        return position;
    }

    private static List<Ship> getNavyPositions(char[][] map){
        List<Ship> navy = new ArrayList<>();

        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[0].length; col++){
                char charAtIndex = map[row][col];

                if(charAtIndex == 'N') {
                    if(row == 0){
                        navy.add(new Ship(col, row, Ship.Direction.SOUTH));
                    }else{
                        navy.add(new Ship(col, row, Ship.Direction.NORTH));
                    }
                }
            }
        }

        return navy;
    }

    private static boolean isCaught(char[][] map, Ship position){
        int X = position.getX();
        int Y = position.getY();

        //UP
        if(Y != 0){
            char up = map[Y - 1][X];
            if(isNavy(up)) return true;
        }

        //DOWN
        if(Y != map.length - 1){
            char down = map[Y + 1][X];
            if(isNavy(down)) return true;
        }

        //RIGHT
        if(X != map[0].length - 1){
            char right = map[Y][X + 1];
            if(isNavy(right)) return true;
        }

        //LEFT
        if(X != 0){
            char left = map[Y][X - 1];
            if(isNavy(left)) return true;
        }

        //TOP-LEFT
        if(Y != 0 && X != 0){
            char topLeft = map[Y - 1][X - 1];
            if(isNavy(topLeft)) return true;
        }

        //TOP-RIGHT
        if(Y != 0 && X != map[0].length - 1){
            char topRight = map[Y - 1][X + 1];
            if(isNavy(topRight)) return true;
        }

        //BOTTOM-LEFT
        if(Y != map.length - 1 && X != 0){
            char bottomLeft = map[Y + 1][X - 1];
            if(isNavy(bottomLeft)) return true;
        }

        //BOTTOM-RIGHT
        if(Y != map.length - 1 && X != map[0].length - 1){
            char bottomRight = map[Y + 1][X + 1];
            if(isNavy(bottomRight)) return true;
        }

        return false;
    }

    private static boolean isNavy(char c){
        return c == 'N';
    }

    private static void printSea(char[][] map){
        System.out.println();

        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[0].length; col++) {
                System.out.print(map[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
