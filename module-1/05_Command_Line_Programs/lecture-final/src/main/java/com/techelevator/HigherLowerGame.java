package com.techelevator;

import java.util.Scanner;

public class HigherLowerGame {

    // Don't worry about what's going on here... at a high level,
    // it is allowing us go call methods in the GameMethods class
    private final GameMethods gameMethods = new GameMethods();

    // main method - runs when JVM starts up
    public static void main(String[] args) {

        // Don't worry about this either - it's a hack that we'll explain soon as well
        HigherLowerGame game = new HigherLowerGame();
        game.play();

    }

    public void play() {

        // 1. Create a scanner for reading from keyboard
        Scanner keyboard = new Scanner(System.in);

        // 2. Call gameMethods.getPlayers and assign the result to variable called players
        String [] players = gameMethods.getPlayers(keyboard);

        // 3. Create an array of ints called scores to hold the number of tries for each player
        int [] scores = new int[players.length];

        System.out.println();
        System.out.println("******* LET'S PLAY *******");



        // 4. Update this to loop through the players array

        for (int i = 0; i < players.length; i++) {

            // print a blank line, then print a message like this: Yoav... it's your turn!
            System.out.println();

            // 5. print a message like Yoav... it's your turn
            System.out.println( players[i] + "... it's your turn!");

            int numberToGuess = GameUtils.getRandomNumber(100);

            // Create a variable to keep track of whether the user has
            // matched the number (we'll use this to determine if the user is done guessing)
            boolean matched = false;

            // create a variable to keep track of the number of tries (call it tries)

            int tries = 0;


            while(!matched) {

                // loop until number is matched. In loop:
                //      1) increase the try count
                //      2) call getInputAndCheckForMatch and assign the result to the variable that indicates if
                //          whether the user matched the number
                tries++;



                /*
                 6. Call the getInputAndCheckForMatch with the input Scanner and the
                    the number the user is trying to match

                    Assign the result to the boolean indicating whether the number was matched
                 */

                matched = gameMethods.getInputAndCheckForMatch(keyboard, numberToGuess);

            }

            // Output final message with number of tries for the user
            System.out.println("Got it! You took " + tries + " tries.");


            // 7. Store the number of tries in the array holding the scores
            scores[i] = tries;
        }

        //  8. Uncomment


            String winner = printScoresAndGetWinner(players, scores);

            // Use the String returned by the printScoresAndGetWinner to print the winner(s).
            System.out.println(winner + " wins!");


    }

    /**
     * Print the scores if all players and return the name of the winner
     * @param names
     * @param scores
     * @return
     */
    public String printScoresAndGetWinner(String[] names, int[] scores) {

        System.out.println();
        System.out.println("Scores");
        System.out.println("-------------------------------");

        int lowestTries = scores[0];

        String winner = "";

        // Loop through all the players and:
        //      1) print a message like this Yoav: 10 tries.
        //      2) check if the score for the current player is lower than lowest number of tries
        //      3) if it is
        //          a) assign the score for the current player in the loop to the lowest number of tries variable
        //          b) set the variable holding the name of the winner to the name of the current player's name
        //      4) Otherwise, if the score is the same as the lowest number of tries, concatenate the players name
        //         to the winner variables (this will handle the situation of a tie)
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index] + ": " + scores[index] + " tries.");

            // If the current score is less than the previous lowest score
            if (scores[index] < lowestTries) {
                // update the lowest with this score
                lowestTries = scores[index];

                // set the name of the winner to this name
                winner = names[index];
            } else if (scores[index] == lowestTries) {
                if (winner.length() > 0 ) {
                    winner += ",  ";
                }
                winner += names[index];
            }
        }

        // 4. Return the name of the winner

        return winner;
    }

}
