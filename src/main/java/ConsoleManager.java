import java.util.Scanner;

public class ConsoleManager {
    Scanner input;
    public ConsoleManager(Scanner input) {
        this.input = input;
    }

    public void printWelcomeMessage() {
        System.out.println("\n================ TIC - TAC - TOE ================");
        System.out.println("    ---------------------------------------");
        System.out.println("    *** Hello and welcome to the game! ***");
        System.out.println("    ---------------------------------------");
        System.out.println("=================================================\n");
    }

    public char promptUserToChooseXorO(Scanner input) {
        String userResponse = "";
        boolean done = false;
        while (!done) {
            System.out.print("Choose X or O\t");
            userResponse = input.nextLine();
            if(Utility.isValidResponseXorO(userResponse)) {
                done = true;
            } else {
                System.out.println("Invalid response, please choose X or O");
            }
        }
        return Character.toUpperCase(userResponse.charAt(0));
    }

    public int promptUserToMakeMove(Scanner input, GameBoard gameBoard, char gamePiece) {
        String userResponse = "";
        int move = 0;
        boolean done = false;

        while (!done) {
            System.out.print("Enter a number [1-9]: ");
            userResponse = input.nextLine();
            if (Utility.isValidResponse1to9(userResponse)) {
                move = Integer.parseInt(userResponse);
            } else {
                System.out.println("Invalid response, please choose a number from 1 to 9");
                continue;
            }

            if (gameBoard.get(move) == 'X' || gameBoard.get(move) == 'O' ) {
                System.out.println("Square " + move + " is already occupied! Choose an unoccupied square [1-9]: ");
            } else {
                gameBoard.makeMove(move, gamePiece);
                done = true;
            }
        }

        return move;
    }

    public boolean promptUserToPlayAgain(Scanner input) {
        String userResponse = "";
        boolean done = false;
        while (!done) {
            System.out.println("Game Over! Would you like to play again? (Y/N)");
            userResponse = input.nextLine();
            if(Utility.isValidResponseYorN(userResponse)) {
                done = true;
            } else {
                System.out.println("Invalid response, please choose Y or N");
            }
        }
        return userResponse.equalsIgnoreCase("N");
    }

    public void printGoodbyeMessage() {
        System.out.println("\n================ TIC - TAC - TOE ================");
        System.out.println("    ---------------------------------------");
        System.out.println("          *** Thanks for Playing! ***");
        System.out.println("    ---------------------------------------");
        System.out.println("=================================================\n");
    }
}
