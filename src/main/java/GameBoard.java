import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GameBoard extends HashMap<Integer, Character> {
    private static final char EMPTY = '*';
    private static final char X = 'X';
    private static final char O = 'O';

    private boolean hasWinner;
    private Token winner;

    public GameBoard() {
        for (int i = 1; i <= 9; i++)
            this.put(i, EMPTY);
        hasWinner = false;
        winner = new Token(EMPTY);
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

    public void makeMove(int move, Token token) {
        this.put(move, token.getSymbol());
    }

    /* boolean checkWinner(Token token)
    *
    *   Tic-Tac-Toe board:
    *         123
    *         456
    *         789
    *
    * Checks if the winning condition has been met in the current game state
    * given a token as the parameter (token contains symbol X or O as a property)
    * Returns true if a winning condition exists, otherwise returns false
    */
    public boolean checkWinner(Token token) {
        char s = token.getSymbol();

        // b is the board state. b[0] is not used because [1..9] match up with the HashMap keys
        char[] b = new char[10];

        for (int i = 1; i <= 9; i++)
            b[i] = this.get(i);

        // Check the board for a winning pattern
        if (    b[1] == s && b[2] == s && b[3] == s ||
                b[4] == s && b[5] == s && b[6] == s ||
                b[7] == s && b[8] == s && b[9] == s ||
                b[1] == s && b[4] == s && b[7] == s ||
                b[2] == s && b[5] == s && b[8] == s ||
                b[3] == s && b[6] == s && b[9] == s ||
                b[1] == s && b[5] == s && b[9] == s ||
                b[3] == s && b[5] == s && b[7] == s
        ) {
            hasWinner = true;
            setWinner(token);
        }
        return hasWinner;
    }

    public boolean hasWinner() {
        return hasWinner;
    }

    public void setHasWinner(boolean hasWinner) {
        this.hasWinner = hasWinner;
    }

    public Token getWinner() {
        return winner;
    }

    public void setWinner(Token winner) {
        this.winner = winner;
    }

}
