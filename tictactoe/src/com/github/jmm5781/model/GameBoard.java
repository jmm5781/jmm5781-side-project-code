package com.github.jmm5781.model;

import java.util.HashMap;

public class GameBoard extends HashMap<Integer, Character> {
    private static final char EMPTY = '*';
    public GameBoard() {
        for (int i = 1; i <= 9; i++) {
            this.put(i, EMPTY);
        }
    }
    public void printBoard() {
        for (int i = 1; i <= 9; i++) {
            Character c = this.get(i);
            System.out.print(" ");
            System.out.print(c == EMPTY ? i : c.toString()); // if empty, print the key [1..9]
            System.out.print(" ");
            if (i % 3 == 1 || i % 3 == 2) System.out.print("|");
            if (i % 3 == 0) System.out.println();
            if (i == 3 || i == 6) System.out.println("---+---+---");
        }
    }

    public void makeMove(int move, char gamePiece) {
                this.put(move, gamePiece);
    }

}
