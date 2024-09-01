import java.util.Scanner;

public class ConsoleManager {
    Scanner input;
    public ConsoleManager(Scanner input) {
        this.input = input;
    }

    public void welcome() {
        System.out.println("\n================ TIC - TAC - TOE ================");
        System.out.println("    ---------------------------------------");
        System.out.println("    *** Hello and welcome to the game! ***");
        System.out.println("    ---------------------------------------");
        System.out.println("=================================================\n");
    }

    public Token chooseXO(Scanner input) {
        String response = "";

        boolean done = false;
        while (!done) {
            System.out.print("Choose X or O\t");
            response = input.nextLine();
            if(Utility.isXO(response)) {
                done = true;
            } else {
                System.out.println("Invalid response, please choose X or O");
            }
        }

        Token token = new Token(response.charAt(0));
        return token;
    }

    public int playerMove(Scanner input, GameBoard gameBoard, Token token) {
        String response = "";
        int square = 0;
        boolean done = false;

        while (!done) {
            System.out.print("Enter a number [1-9]: ");
            response = input.nextLine();
            if (Utility.is1to9(response)) {
                square = Integer.parseInt(response);
            } else {
                System.out.println("Invalid response, please choose a number from 1 to 9");
                continue;
            }

            if (gameBoard.get(square) == 'X' || gameBoard.get(square) == 'O' ) {
                System.out.println(square + " is already occupied! Choose an unoccupied space [1-9]: ");
            } else {
                gameBoard.makeMove(square, token);
                done = true;
            }
        }

        return square;
    }

    public boolean playAgain(Scanner input) {
        String response = "";

        boolean done = false;
        while (!done) {
            System.out.println("Game Over! Would you like to play again? (Y/N)");

            response = input.nextLine();
            if(Utility.isYN(response)) {
                done = true;
            } else {
                System.out.println("Invalid response, please choose Y or N");
            }
        }

        return response.equalsIgnoreCase("Y");
    }

    public void goodbye() {
        System.out.println("\n================ TIC - TAC - TOE ================");
        System.out.println("    ---------------------------------------");
        System.out.println("          *** Thanks for Playing! ***");
        System.out.println("    ---------------------------------------");
        System.out.println("=================================================\n");
    }
}
