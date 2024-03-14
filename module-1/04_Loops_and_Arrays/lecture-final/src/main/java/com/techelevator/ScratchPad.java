package com.techelevator;

public class ScratchPad {

    public static void main(String[] args) {

//        int [] nums =  {5, 7, 8, 9, 9};

//        int [] nums = new int [] {5, 7, 8, 9, 9};

        int [] nums = new int[5];
//        nums[0] = 5;
//        nums[1] = 7;
//        nums[2] = 8;
//        nums[3] = 9;
//        nums[4] = 9;
//        System.out.println("Done");


        String[] names1 = {"Larry", "Curly", "Moe"};
        String[] names2 = {"Cindy", "Kate", "Maryanne", "Barbara"};

        printNames(names1);
        System.out.println();
        printNames(names2);

        System.out.println();

        // can pass array data "on the fly" (without a vairable)
        // but MUST use new with array data type
        printNames(new String [] {"Yoav", "Linda"});

        int result1 = findLargestNum(new int[] {4,8,37,7,3});
    }

    public static void printNames(String[] names) {
        for (int nameIndex = 0; nameIndex < names.length; nameIndex++) {
            System.out.println(names[nameIndex]);
        }
    }

    public static String checkIfOk() {

        boolean isOk = false;

        return isOk ? "OK" : "Error";
    }

    public static int findLargestNum(int [] nums) {

        int largest = nums[0];

        for( int index = 0; index < nums.length; index++) {
            int curNum = nums[index];
            if (curNum > largest) {
                largest = curNum;
            }
        }

        return largest;
    }
}
