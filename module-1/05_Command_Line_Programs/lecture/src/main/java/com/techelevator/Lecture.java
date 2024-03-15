package com.techelevator;

import java.util.Scanner;

public class Lecture {


    public static void main(String[] args) {

        // print a prompt that asks for a name


        // Get input from the user and assign result to a String called name


        // print a message like Hello Yoav!!!!


        /*****************************************************************************************************
             TESTING FOR GAME METHODS
         *****************************************************************************************************/

        // Don't worry about what's going on here... at a high level,
        // it is allowing us go call methods in the GameMethods class

        GameMethods gameMethods = new GameMethods();

        /*
        String[] players = gameMethods.getPlayers(input);

        for (int index = 0; index < players.length; index++) {
            System.out.println(players[index]);
        }

         */

        /*
        boolean matched = false;
        while(!matched) {
            matched = gameMethods.getInputAndCheckForMatch(input, 5);
        }

        System.out.println("You got it!");

         */


    }
}
