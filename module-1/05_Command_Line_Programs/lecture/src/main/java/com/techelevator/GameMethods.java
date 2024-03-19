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
    String[] getPlayers(Scanner input) {
        System.out.print("Enter names of players separated by spaces:\t");
        String[] names = input.nextLine().split(" ");
        return names;
    }


    /*
        Create a method called getInputAndCheckForMatch which receives a Scanner
        and the number the user is trying to match as params and returns a boolean
        It Should:
            1. print a blank line
            2. print a prompt that says Enter yor guess:
            3. get input from user
            4. use utils.isNumber to check if the String the user typed is a number
            5. if it is
                * convert the input to a number
                * check if the number is a match, if it is return true
                * If not, print a message indicating whether to guess higher ot lower and return false
            6. if it isn't
                * print the message Invalid input... pleaae try again.
                * return false
     */
    boolean getInputAndCheckForMatch(Scanner input, int numToMatch) {
        System.out.println();
        System.out.print("Enter your guess:\t");
        String userGuessString = input.nextLine();

        if (!GameUtils.isNumber(userGuessString)) {
            System.out.println("That is not a valid number. Try again!");
            return false;
        }

        int userGuessInt = Integer.parseInt(userGuessString);
        if (userGuessInt == numToMatch) {
            return true;
        } else if (userGuessInt < numToMatch){
            System.out.println("Too low... guess a higher number.");
        } else {
            System.out.println("Too high... guess a lower number.");
        }

        return false;
    }

}
