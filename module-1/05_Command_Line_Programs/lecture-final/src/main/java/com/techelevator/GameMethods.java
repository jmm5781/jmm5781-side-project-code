package com.techelevator;

import java.util.Scanner;

public class GameMethods {


    /*
        Create a method called getPlayers which receives a Scanner as a param and returns an array of Strings

        It Should:
             1. print out a prompt message that says Enter names of players separated by spaces:
             2. Use the input Scanner to get a line of input
             3. Convert the line read above to an array containing the names of the players
             4. Return the array of names
     */

    public String [] getPlayers(Scanner input) {
        System.out.print("Enter names of players separated by spaces: ");

        String namesString = input.nextLine();
        String [] names = namesString.split(" ");

        return names;
    }


    /*
        Create a method called getInputAndCheckForMatch whichs receives a Scanner
        and the number the user is trying to match as params and returns a boolean
        It Should:
            1. print a blank line
            2. print a prompt that says Enter yor guess:
            3. get input from user
            4. use GameUtils.isNumber to check if the String the user typed is a number
            5. if it is
                * convert the input to a number
                * check if the number is a match, if it is return true
                * If not, print a message indicating whether to guess higher ot lower and return false
            6. if it isn't
                * print the message Invalid input... pleaae try again.
                * return false
     */

    public boolean getInputAndCheckForMatch(Scanner input, int numToMatch) {
        System.out.println();
        System.out.print("Enter your guess: ");
        String userInput = input.nextLine();
        if (GameUtils.isNumber(userInput)) {
            int guess = Integer.parseInt(userInput);

            if (guess == numToMatch) {
                return true;
            } else {
                if (guess > numToMatch) {
                    System.out.println("Guess lower.");
                } else {
                    System.out.println("Guess higher.");
                }
                return false;
            }

        } else {
            System.out.println("Invalid input... pleaae try again.");
        }
        return false;
    }

}
