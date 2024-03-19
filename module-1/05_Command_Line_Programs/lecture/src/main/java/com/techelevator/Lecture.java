package com.techelevator;

import java.util.Scanner;

public class Lecture {


    public static void main(String[] args) {

        // print a prompt that asks for a name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // Get input from the user and assign result to a String called name
        String name = input.nextLine();


        // print a message like Hello Yoav!!!!
        System.out.println("Hello " + name + "!!!");

        /*****************************************************************************************************
             TESTING FOR GAME METHODS
         *****************************************************************************************************/

        // Don't worry about what's going on here... at a high level,
        // it is allowing us go call methods in the GameMethods class

        GameMethods gameMethods = new GameMethods();


        String[] players = gameMethods.getPlayers(input);

        System.out.print("The players are ");
        for (int index = 0; index < players.length; index++) {
            System.out.print(players[index]);
            System.out.print(index < players.length - 1 ? ", " : "\n");
        }


        boolean matched = false;
        while(!matched) {
            matched = gameMethods.getInputAndCheckForMatch(input, 74);
        }

        System.out.println("You got it!");


    }
}
