package com.techelevator;

public class BlocksDemo {

    public static void main(String[] args) {

        boolean isComplete = true;
        isComplete = false;


        System.out.println("****************************************************");
        System.out.println("*                If with block                      ");
        System.out.println("****************************************************");

        System.out.println("isComplete: " + isComplete);
        System.out.println();

        /*
        if (isComplete) {
            System.out.println("It's complete");
            System.out.println("Really... it's complete");
        }
        System.out.println("all done")

        */




        System.out.println();
        System.out.println("****************************************************");
        System.out.println("*                If without block                      ");
        System.out.println("****************************************************");

        isComplete = false;

        System.out.println("isComplete: " + isComplete);
        System.out.println();

        if (isComplete)
            System.out.println("It's complete");
        System.out.println("Really... it's complete");

        System.out.println("all done");



    }

    // ignore static for now we will discuss this more and learn
    // how to avoid needing it here
    public static void doSomeStuff(boolean isComplete) {
        if (isComplete) {
            System.out.println("It's complete");
            System.out.println("Really... it's complete");
        }
        System.out.println("all done");
    }

    // ignore static for now we will discuss this more and learn
    // how to avoid needing it here
    public static void doSomeStuffWithoutBlock(boolean isComplete) {
        if (isComplete)
            System.out.println("It's complete");
        System.out.println("Really... it's complete");

        System.out.println("all done");
    }


}
