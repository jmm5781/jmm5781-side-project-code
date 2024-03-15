package com.techelevator;

public class ScratchPad {

    public void run() {

//        int [] emptyInts = new int[0];
//        int [] emptyInts = new int[] {};
        int [] emptyInts = {};

        String [] names = {"Mary", "Sue", "John", "Xavier"};

        String [] shorterNames = new String[names.length - 1];
        for (int index = 1; index < names.length; index++) {
            // copy names[1] to shorterNames[0] etc
            shorterNames[index - 1] = names[index];
        }

        int [] nums = new int[3];

        nums[0] = 5;
        nums[1] = 25;
        nums[2] = 58;

        int x;


        boolean doIt = true;

        if (doIt) {
            x = 7;
        } else {
            x = 9;
        }

        System.out.println(x);






    }


    public static void main(String[] args) {
        ScratchPad pad = new ScratchPad();
        pad.run();
    }
}
