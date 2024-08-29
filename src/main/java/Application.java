import java.util.Scanner;

/**************
 * TODO
 * Make a win condition check using
 *      (1) bitboards: at least 9 bits (use a short??)
 *      -or-
 *      (2) map lookup and comparison
 * Check for invalid int input [1..9] with try/catch
 * Override toString to print the com.github.jmm5781.model.GameBoard
 * Make a Player class with human and bot options
 * Put the game pieces X, O into a class and/or as properties of Player class
 * Add some ASCII art: https://www.asciiart.eu/computers/game-consoles
 * Try changing text color using ASCII escape codes (results may vary by console, terminal or OS)
 * Add some sounds: https://pixabay.com/sound-effects/search/retro%20games/, Java Sound API
 *
 * Database:
 * - player, leaderboard, saved_game tables
 *
 * REST:
 * - POST game board, players to server
 * - PUT updates to server while playing
 * - GET game logic updates while playing (to display on screen)
 * - PUT high score updates to server
 * - etc.
 *
 * Long term:
 * Network multiplayer
 * Make it 4x4
 * Make it 3D (3x3x3)
 * Add graphics
 *
 * [DONE] Make a com.github.jmm5781.model.GameBoard map (extend HashMap or make it an instance variable)
 * [DONE] Print the com.github.jmm5781.model.GameBoard
 * [DONE] Prevent moving onto an already occupied square
 */

public class Application {
    private final Scanner input;
    private final ConsoleManager consoleManager;
    private static final int MAX_TURNS = 9;

    public Application() {
        input = new Scanner(System.in);
        consoleManager = new ConsoleManager(input);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run() {
        consoleManager.welcome();

        boolean done = false;
        while (!done) {

            System.out.print("Player 1: ");
            Token player1Token = consoleManager.chooseXO(input); // TODO: make a Player class
            Token player2Token = new Token(player1Token.getSymbol() == 'X' ? 'O' : 'X');

            GameBoard gameBoard = new GameBoard();

            int turn = 1;
            boolean isWinner = false;
            Token currentToken = new Token(player1Token.getSymbol()); // TODO: make a Player class

            int currentPlayerMove = 0;
            while (turn <= MAX_TURNS && !isWinner) {
                System.out.println("\n " + currentToken + "'s turn");

                gameBoard.printBoard();

                System.out.print("\nPlayer " + currentToken + ": "); // TODO -- should say Player 1 or 2

                currentPlayerMove = consoleManager.playerMove(input, gameBoard, currentToken);
                gameBoard.makeMove(currentPlayerMove, currentToken);
                currentToken.setSymbol(currentToken.getSymbol() == 'X' ? 'O' : 'X');

                turn++;
            }

            gameBoard.printBoard();

            done = !consoleManager.playAgain(input);
        }

        consoleManager.goodbye();
    }

}
