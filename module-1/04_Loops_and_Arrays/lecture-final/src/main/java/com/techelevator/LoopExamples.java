package com.techelevator;

import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {


        System.out.println("*****************************************");
        System.out.println("*                For Loop               *");
        System.out.println("*****************************************");
        System.out.println();

        int max = 7;

        System.out.println("running forLoopExample (max=" + max + "): ");
        System.out.println();

        for (int linda = 1; linda <= max; linda++) {
            System.out.println("Iteration " + linda);
        }

        System.out.println();



//        max = 5;
        max = 0;

        System.out.println("*****************************************");
        System.out.println("*               While Loop              *");
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("running while loop (max=" + max + ") ...");
        System.out.println();
        int i = 1;

        // will run as long as condition evaluates to true

        // NOTE that if max is 0 it will not run AT ALL
        while (i <= max) {
            System.out.println("Iteration " + i);
            i++;
        }
        System.out.println();





        System.out.println();

        System.out.println("*****************************************");
        System.out.println("*              Do-While Loop            *");
        System.out.println("*****************************************");
        System.out.println();

//        max = 5;
        max = 0;

        System.out.println("running do-while loop (max=" + max + ") ...");
        System.out.println();

       i = 1;

        // do is guaranteed to run at least once even if while evaluates to false
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= max);

        System.out.println();





        System.out.println("*****************************************");
        System.out.println("*                 Scope                 *");
        System.out.println("*****************************************");
        System.out.println();

        boolean done = false;

//        String status = "";

        for (int count = 1; count <= 3; count++) {
            String status = "running";
            if (count == 3) {
                status = "done";
            }
            System.out.println(status);
            done = true;
            System.out.println("Done: " + done);
        }

//        System.out.println("status: " + status);
        System.out.println();
//        int sillyNum = 1;
        for (int count = 1; count <= 3; count++) {
            // This will be recreated EACH time through the loop
            // so will not change even though it is incremented at the end
            // because it will be RECREATED with 1 on the next iteration
            //
            // If you want to retain the value, declare it outside of the loop
            // as int the commented out code above
            int sillyNum = 1;
            System.out.println("sillyNum: " + sillyNum);
            sillyNum++;
        }
//        System.out.println("final sillyNum: " + sillyNum);



    }
}
