import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Application {
    private Scanner input = new Scanner(System.in);
    private ConsoleManager consoleManager = new ConsoleManager(input);
    private static final int MAX_NUMBER_OF_TURNS = 9;
    public Application() {

    }
    public void run() {
        consoleManager.printWelcomeMessage();

        boolean done = false;
        while (!done) {
            System.out.print("Player 1: ");
            char playerOneGamePiece = consoleManager.promptUserToChooseXorO(input);
            System.out.print("--- Player 1 will play as " + playerOneGamePiece + "! ---\t\t--- ");

            char playerTwoGamePiece = playerOneGamePiece == 'X' ? 'O' : 'X';
            System.out.println("Player 2 will play as " + playerTwoGamePiece + "! ---");

            GameBoard gameBoard = new GameBoard();
            int turn = 1;
            boolean thereIsAWinner = false;
            char currentPlayerGamePiece = playerOneGamePiece;
            while (turn <= MAX_NUMBER_OF_TURNS && !thereIsAWinner) {
                System.out.println("\n\t" + currentPlayerGamePiece + "'s turn!\t\tEnter a number [1-9]:");
                gameBoard.printBoard();

                // game loop

                currentPlayerGamePiece = currentPlayerGamePiece == 'X' ? 'O' : 'X';
                turn++;
            }

            done = consoleManager.promptUserToPlayAgain(input);
        }

    }
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}