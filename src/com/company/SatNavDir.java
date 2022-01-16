package com.company;

class Position{
    private double x;
    private double y;

    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

//TODO
public class SatNavDir {
    static enum Direction{
        NORTH,
        WEST,
        SOUTH,
        EAST
    }
    static Position position;
    static Direction direction = Direction.NORTH;

    public static Position satNav(final String[] directions) {
        position = new Position(0, 0);
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

                double metersToNextTurn = lengthToNextTurn(lenToMakeTurn);
                move(metersToNextTurn);
                direction = leftAndRightToDirection(nextDirection);
            }

            if(command.startsWith("Go straight")){
                String distance = commands[4];
                double kmToTarget = straightToDistance(distance);
                move(kmToTarget);
            }
        }

        System.out.println("End X: " + position.getX());
        System.out.println("End Y: " + position.getY());
        return position;
    }

    private static void move(double distance){
        double X = position.getX();
        double Y = position.getY();

        switch (direction){
            case NORTH:
                position.setY(Y + distance);
            break;
            case SOUTH:
                position.setY(Y - distance);
                break;
            case WEST:
                position.setX(X - distance);
                break;
            case EAST:
                position.setX(X + distance);
                break;
        }
    }

    private static double straightToDistance(String metric){
        double distanceNotConverted = Double.parseDouble(metric.replaceAll("[^0-9\\.]",""));
        if(metric.contains("km")){
            return distanceNotConverted;
        }else{
            return distanceNotConverted / 1000;
        }
    }

    private static double lengthToNextTurn(String distanceToNextTurn){
        double blockMeterDistance = 1.0;
        double nextDirectionLength = Double.parseDouble(distanceToNextTurn.replaceAll("\\D", "")) * blockMeterDistance;

        System.out.println(nextDirectionLength);

        if("NEXT".equals(distanceToNextTurn)) {
            return blockMeterDistance;
        }
        return blockMeterDistance * nextDirectionLength;
    }

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
