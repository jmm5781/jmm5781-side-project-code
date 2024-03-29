import java.util.Scanner;

/**************
 * TODO
 * [DONE] Make a GameBoard map (extend HashMap or make it an instance variable)
 * Make a win condition check using
 *      (1) bitboards: at least 9 bits
 *      -or-
 *      (2) map lookup and comparison
 * [DONE] Print the GameBoard
 * Override toString to print the GameBoard
 * Make a Player class with human and bot options
 * Put the game pieces X, O into a class
 * Add some ASCII art: https://www.asciiart.eu/computers/game-consoles
 * Add some sounds: https://pixabay.com/sound-effects/search/retro%20games/, Java Sound API
 */

public class Application {
    private Scanner input;
    private ConsoleManager consoleManager;
    private static final int MAX_NUMBER_OF_TURNS = 9;
    public Application() {
        input = new Scanner(System.in);
        consoleManager = new ConsoleManager(input);
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
            int currentPlayerMove = 0;
            while (turn <= MAX_NUMBER_OF_TURNS && !thereIsAWinner) {
                System.out.println("\n " + currentPlayerGamePiece + "'s turn!");

                gameBoard.printBoard();

                currentPlayerMove = consoleManager.promptUserToMakeMove(input);
                System.out.println(">>>>>>> " + currentPlayerGamePiece + " chose " + currentPlayerMove);

                gameBoard.makeMove(currentPlayerMove, currentPlayerGamePiece);

                currentPlayerGamePiece = currentPlayerGamePiece == 'X' ? 'O' : 'X';
                turn++;
            }

            done = consoleManager.promptUserToPlayAgain(input);
        }

        consoleManager.printGoodbyeMessage();

    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}