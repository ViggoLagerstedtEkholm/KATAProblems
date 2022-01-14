package com.company;

import java.util.List;

public class ConnectFour {
    public String whoIsWinner(List<String> piecesPositionList) {
        //6 rows and 7 cols.
        char[][] grid = new char[6][7];

        //Populate the 2D board with O's that represent our empty slots.
        initializeBoard(grid);

        //Go through the array of all moves.
        for(String playerMove : piecesPositionList){
            //Get player move information.
            String[] information = playerMove.split("_");

            char move = information[0].charAt(0);
            char player = information[1].charAt(0);

            //Convert A-G columns to 0-6.
            int selectedColumn = (int) move % 32;

            //Starting from the deepest row, traverse upwards until the slot in that column is available.
            for (int row = grid.length - 1; row >= 0; row--){
                if(grid[row][selectedColumn - 1] == 'O'){
                    grid[row][selectedColumn - 1] = player;
                    break;
                }
            }

            boolean hasWinner = isWinner(player, grid);
            if(hasWinner){
                showBoard(grid);
                return information[1];
            }
        }
        showBoard(grid);

        return "Draw";
    }

    private void initializeBoard(char[][] grid){
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = 'O';
            }
        }
    }

    private void showBoard(char[][] grid){
        for (char[] chars : grid) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(" " + chars[col]);
            }
            System.out.println();
        }
    }

    private static boolean isWinner(char player, char[][] grid){
        //check for 4 across
        for (char[] chars : grid) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (chars[col] == player &&
                        chars[col + 1] == player &&
                        chars[col + 2] == player &&
                        chars[col + 3] == player) {
                    return true;
                }
            }
        }
        //check for 4 up and down
        for(int row = 0; row < grid.length - 3; row++){
            for(int col = 0; col < grid[0].length; col++){
                if (grid[row][col] == player   &&
                        grid[row+1][col] == player &&
                        grid[row+2][col] == player &&
                        grid[row+3][col] == player){
                    return true;
                }
            }
        }
        //check upward diagonal
        for(int row = 3; row < grid.length; row++){
            for(int col = 0; col < grid[0].length - 3; col++){
                if (grid[row][col] == player   &&
                        grid[row-1][col+1] == player &&
                        grid[row-2][col+2] == player &&
                        grid[row-3][col+3] == player){
                    return true;
                }
            }
        }
        //check downward diagonal
        for(int row = 0; row < grid.length - 3; row++){
            for(int col = 0; col < grid[0].length - 3; col++){
                if (grid[row][col] == player   &&
                        grid[row+1][col+1] == player &&
                        grid[row+2][col+2] == player &&
                        grid[row+3][col+3] == player){
                    return true;
                }
            }
        }
        return false;
    }
}
