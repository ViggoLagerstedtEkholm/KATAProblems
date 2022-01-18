package com.company.solution_4kyu;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathFinder {
    public static boolean pathFinder(String maze) {
        String[][] board = getBoard(maze);
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));
        boolean[][] visited = new boolean[board.length][board.length];

        //BFS ALGORITHM IMPLEMENTATION.
        while(!queue.isEmpty()){
            Point current = queue.remove();
            int cPointX = (int) current.getX();
            int cPointY = (int) current.getY();

            board[cPointX][cPointY] = "V";

            if(cPointX == board[0].length -1 && cPointY == board.length - 1) return true;

            List<Point> nodes = getAdj(board, current, visited);
            queue.addAll(nodes);
        }

        return false;
    }

    private static List<Point> getAdj(String[][] board, Point currentNode, boolean[][] visited){
        ArrayList<Point> nodes = new ArrayList<>();

        int X = (int) currentNode.getX();
        int Y = (int) currentNode.getY();

        int boardWidth = board[0].length - 1;
        int boardHeight = board.length - 1;

        //UP
        if(Y != 0 && !board[X][Y - 1].equals("W") && !visited[X][Y - 1]){
            nodes.add(new Point(X, Y - 1));
            visited[X][Y - 1] = true;
        }

        //DOWN
        if(Y != boardHeight && !board[X][Y + 1].equals("W") && !visited[X][Y + 1]){
            nodes.add(new Point(X, Y + 1));
            visited[X][Y + 1] = true;
        }

        //RIGHT
        if(X != boardWidth && !board[X + 1][Y].equals("W") && !visited[X + 1][Y]){
            nodes.add(new Point(X + 1, Y));
            visited[X + 1][Y] = true;
        }

        //LEFT
        if(X != 0 && !board[X - 1][Y].equals("W") && !visited[X - 1][Y]){
            nodes.add(new Point(X - 1, Y));
            visited[X - 1][Y] = true;
        }

        return nodes;
    }

    private static String[][] getBoard(String maze){
        String[] lines = maze.split("\\n");
        String[][] board = new String[lines.length][lines.length];

        for(int i = 0; i < lines.length; i++) {
            board[i] = lines[i].split("");
        }

        return board;
    }
}