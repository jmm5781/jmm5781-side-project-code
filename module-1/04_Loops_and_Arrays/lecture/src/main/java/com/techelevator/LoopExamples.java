package com.techelevator;

public class LoopExamples {

    public static void main(String[] args) {


//        System.out.println("*****************************************");
//        System.out.println("*                For Loop               *");
//        System.out.println("*****************************************");
//        System.out.println();
//
        int max = 3;
//
//        System.out.println("running forLoopExample (max=" + max + "): ");
//        System.out.println();
//
//        for (int i = 1; i <= max; i++) {
//            System.out.println("Iteration " + i);
//        }
//
//        System.out.println();



//        max = 5;
////        max = 0;
//
//        System.out.println("*****************************************");
//        System.out.println("*               While Loop              *");
//        System.out.println("*****************************************");
//        System.out.println();
//
//        System.out.println("running while loop (max=" + max + ") ...");
//        System.out.println();
        int i = 1;
//
//        // will run as long as condition evaluates to true
//        while (i <= max) {
//            System.out.println("Iteration " + i);
//            i++;
//        }
//        System.out.println();





//        System.out.println();
//
//        System.out.println("*****************************************");
//        System.out.println("*              Do-While Loop            *");
//        System.out.println("*****************************************");
//        System.out.println();
//
//        max = 5;
////        max = 0;
//
//        System.out.println("running do-while loop (max=" + max + ") ...");
//        System.out.println();
//
//       i = 1;
//
//        // do is guaranteed to run at least once even if while evaluates to false
//        do {
//            System.out.println("Iteration " + i);
//            i++;
//        } while (i <= max);
//
//        System.out.println();





        System.out.println("*****************************************");
        System.out.println("*                 Scope                 *");
        System.out.println("*****************************************");
        System.out.println();

        boolean done = false;

        for (int count = 1; count <= 3; count++) {
            String status = "running";
            if (count == 3) {
                status = "done";
            }
            System.out.println(status);
        }

//        System.out.println("status: " + status);
        System.out.println();



    }
}
