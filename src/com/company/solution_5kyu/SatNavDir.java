package com.company.solution_5kyu;

import java.awt.*;

//TODO
public class SatNavDir {
    static enum Direction{
        NORTH,
        WEST,
        SOUTH,
        EAST
    }
    private static Point position;
    private static Direction direction = Direction.NORTH;

    public static Point satNav(final String[] directions) {
        position = new Point(0, 0);
        for (String command : directions)
        {
            if(command.equals("You have reached your destination!")) {
                break;
            }

            if(command.equals("Turn around!")){
                direction = turnAround(direction);
            }

            String[] commands = command.split(" ");

            if(command.startsWith("Head")){
                direction = startDir(commands[1]);
            }

            if(command.startsWith("Take the")){
                String lenToMakeTurn = commands[2];
                String nextDirection = commands[3];

                goToTurn(lenToMakeTurn);
                direction = leftAndRightToDirection(nextDirection);
            }

            if(command.startsWith("Go straight")){
                String distance = commands[4];
                double kmToTarget = straightToDistance(distance);
                move(kmToTarget);
            }
        }

        return position;
    }

    private static void move(double distance){
        int posX = (int) position.getX();
        int posY = (int)position.getY();

        switch (direction){
            case NORTH:
                position.setLocation(posX, posY + distance);
            break;
            case SOUTH:
                position.setLocation(posX, posY - distance);
                break;
            case EAST:
                position.setLocation(posX + distance, posY);
                break;
            case WEST:
                position.setLocation(posX - distance, posY);
                break;
        }
    }

    private static double straightToDistance(String metric){
        double straightDistance = Double.parseDouble(metric.replaceAll("[^0-9\\.]",""));
        if(metric.contains("km")){
            return straightDistance * 10.0;
        }else{
            return straightDistance / 100.0;
        }
    }

    private static void goToTurn(String distanceToNextTurn){
        int distance;
        if(distanceToNextTurn.equals("NEXT")) {
            distance = 1;
        }else{
            distance = Integer.parseInt(distanceToNextTurn.replaceAll("\\D", ""));
        }

        int currentX = (int) position.getX();
        int currentY = (int) position.getY();

        switch (direction){
            case NORTH:
                distance = (int) (10 * (Math.floor(currentY / 10.0) + distance));
                position.setLocation(currentX, distance);
                break;
            case SOUTH:
                distance = (int) (10 * (Math.ceil(currentY / 10.0) - distance));
                position.setLocation(currentX, distance);
                break;
            case EAST:
                distance = (int) (10 * (Math.floor(currentX / 10.0) + distance));
                position.setLocation(distance, currentY);
                break;
            case WEST:
                distance = (int) (10 * (Math.ceil(currentX / 10.0) - distance));
                position.setLocation(distance, currentY);
                break;
        }
    }

    //Method that flips the direction depending on current direction + LEFT or RIGHT.
    private static Direction leftAndRightToDirection(String leftOrRight){
        switch (leftOrRight){
            case "LEFT":
                    switch (direction){
                        case NORTH: return Direction.WEST;
                        case WEST: return Direction.SOUTH;
                        case SOUTH: return Direction.EAST;
                        case EAST: return Direction.NORTH;
                    }
                break;
            case "RIGHT":
                switch (direction){
                    case NORTH: return Direction.EAST;
                    case EAST: return Direction.SOUTH;
                    case SOUTH: return Direction.WEST;
                    case WEST: return Direction.NORTH;
                }
                break;
        }
        return null;
    }

    //String to direction.
    private static Direction startDir(String direction){
        switch (direction) {
            case "NORTH": return Direction.NORTH;
            case "WEST": return Direction.WEST;
            case "SOUTH": return Direction.SOUTH;
            case "EAST": return Direction.EAST;
            default: return null;
        }
    }

    //Move around 180 degrees.
    private static Direction turnAround(Direction direction){
        switch (direction) {
            case NORTH: return Direction.SOUTH;
            case WEST: return Direction.EAST;
            case SOUTH: return Direction.NORTH;
            case EAST: return Direction.WEST;
            default: return null;
        }
    }
}
