package com.techelevator;


import java.util.Scanner;

public class Lecture {


    public static void main(String[] args) {

        /*
        System.out.println("Item 1 ");
        System.out.println("Item 2 ");

        System.out.print("Item 1 ");
        System.out.println("Item 2 ");
*/

        // print a prompt that asks for a name
        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Enter your name: ");


        // Get input from the user and assign result to a String called name

//        String userInput = keyboard.nextLine();


        // print a message like Hello Yoav!!!!
//        System.out.println("Hello " + userInput + "!!!!");

        /*
        System.out.println("Enter a number: ");
        int userNum = keyboard.nextInt();
        System.out.println("Number is: " + userNum);

        System.out.println("Enter anoter number: ");
         userNum = keyboard.nextInt();
        System.out.println("Number is: " + userNum);


        String enterChar = keyboard.nextLine();

        System.out.println("Enter your name: ");
        String userInput = keyboard.nextLine();


        // print a message like Hello Yoav!!!!
        System.out.println("Hello " + userInput + "!!!!");

         */

        /*
        System.out.print("Enter your name: ");
        String userInput = keyboard.nextLine();

        System.out.println("Enter your age: ");
        String ageString = keyboard.nextLine();
        System.out.println(ageString + 7);

        int age = Integer.parseInt(ageString);
        System.out.println(age);
        System.out.println(age + 7);*/

        /*
        System.out.print("Enter some n" +
                "ames, separated by spaces: ");
        String namesList = keyboard.nextLine();
        String [] names = namesList.split(", ");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("done");
        */

        /*
        String ageString = keyboard.nextLine();
        System.out.println(ageString + 7);

        int age = Integer.parseInt(ageString);
        System.out.println(age);
        System.out.println(age + 7);

         */



//        if (choice.equals("Y")) {
//            System.out.println("Yes!");
//        } else if (choice.equals("N")) {
//            System.out.println("No!");
//        } else if (choice.equals("X")) {
//            System.out.println("Bye!");
//        } else {
//            System.out.println("Ignoring....");
//        }

        /*
        boolean done = false;

        while (!done) {
            System.out.print("Type Y, N, or X to exit: ");
            String choice = keyboard.nextLine();


            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Yes!");
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("No!");
            } else if (choice.equalsIgnoreCase("X")) {
                System.out.println("Bye!");
                done = true;
            } else {
                System.out.println("Ignoring....");
            }
        }

         */





        /*****************************************************************************************************
             TESTING FOR GAME METHODS
         *****************************************************************************************************/

        // Don't worry about what's going on here... at a high level,
        // it is allowing us go call methods in the GameMethods class

//        Scanner input = new Scanner(System.in);

        GameMethods gameMethods = new GameMethods();


        /*
        String[] players = gameMethods.getPlayers(keyboard);

        for (int index = 0; index < players.length; index++) {
            System.out.println(players[index]);
        }
        */




        boolean matched = false;
        while(!matched) {
            matched = gameMethods.getInputAndCheckForMatch(keyboard, 5);

//            boolean correct = gameMethods.getInputAndCheckForMatch(keyboard, 5);
//            if (correct) {
//                matched = true;
//            }
        }


        System.out.println("You got it!");



        /*


                10^2   10^1  10^0
                 100         10      1
                  1*100           0*10          1*3
            103



         */




    }
}
