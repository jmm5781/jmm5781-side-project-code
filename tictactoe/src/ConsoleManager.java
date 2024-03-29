import java.util.Scanner;

public class ConsoleManager {
    Scanner input;
    public ConsoleManager(Scanner input) {
        this.input = input;
    }

    public void printWelcomeMessage() {
        System.out.println("\n================ TIC - TAC - TOE ================");
        System.out.println("\n    *** Hello and welcome to the game! ***\n");
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
        System.out.println("\n    *** Thanks for Playing! ***\n");
        System.out.println("=================================================\n");
    }
}
