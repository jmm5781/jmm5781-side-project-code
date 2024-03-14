package com.techelevator;

public class ScratchPad {

    public static void main(String[] args) {

        int largeIntNum = 1000000000;
        int smallInt = 3;

        // once the numbers are mutiplied, the result will be too big to fit in an int
        // but the compiler doesn't know this so you will get an unexpected result because
        // there isn't enough space in the int result to hold the value
        int val1 = largeIntNum * smallInt;
        System.out.println(val1);

        // if you use longs you won't have an issue because there will be room for the result
        long largeLongNum = 1000000000;
        long smallLong = 3;

        long val2 = largeLongNum * smallLong;

        System.out.println(val2);

        // if you down-cast the long result to an int, the origial problem
        // occurs again because you have tried to force the result back into
        // an int which doesn't have enough space for it
        System.out.println((int) val2);


        long long1 = 3;
        long long2 = 5;

        // downcasting is possible when the vaues work ok but be careful because
        // you can run into issues if the data isn't quite what you expected
        int result1 =  (int) (long1 * long2);


        int int1 = 3;
        int int2 = 5;

        int result2 = int1 * int2;
        System.out.println(result2);

        // expressions that only involve ints will yields ints no matter what
        // you can cast to a long if you want to. Up-casting is never a problem
        // because you go from less space to more space
        long longResult = (long) (int1 * int2);
        System.out.println(longResult);





        double dollars = 1.5;
        System.out.println(dollars);

        // casting a double to an int will truncate the decimal portion
        int wholeDollars = (int) dollars;
        System.out.println(wholeDollars);


        long num1Long = 5;
        int num2Int = 3;

//        int result4 = num1Long * num2Int;

        // any expression where the most complex piece of info is a long
        // will evaluate to a long - here you MUST assign to long... int won't work
        long result4 = num1Long * num2Int;


        double decimal1 = 3.4;

//        int result5 = decimal1 + num2Int;

        // when a double is involved, will evaluate to double
        double result5 = decimal1 + num2Int;

        String someText = "Hi";

        System.out.println(someText + decimal1);

        int castInt1 = 15;
        int castInt2 = 6;

        // because these are all ints, you will lose the decimal portion of the result since
        // result will be int
        int result6 = (castInt1 + castInt2) / 2;
        System.out.println(result6);

        // you can force a double result by specifying one of the values is a double in some way
        // this will yield a double result which won't lose the decimal
        double result7 = (castInt1 + castInt2) / (double)2;
        System.out.println(result7);

        double result8 = (double) ((castInt1 + castInt2) / 2);
        System.out.println(result8);


        // (Temperature in degrees Fahrenheit (°F) - 32) * 5/9.

//        double result9 = (20 -32) * (5/9);

        // because 5 and 9 are ints, the decimal portion of 5/9 will get lost and you will get 0
        // casting the result to double will just make that 0.0 since the casting happened AFTER
        // the result was evaluated
        System.out.println(  (double) (5/9));

        // including a double in the formula (5/9.0) will yield the correct result
        System.out.println(5/9.0);
        double result9 = (20 -32) * (5/9.0);
        System.out.println(result9);


        // calling addNums method with different params and
        // holding on to the result it returns

        int result10 = addNums(5, 6);
        System.out.println(result10);

        int result11 = addNums(245, 3);
        System.out.println(result11);

        int result12 = addNums(1, 1);
        System.out.println(result12);

        addNums(7, 9);

        printIt("Hello");
        printIt("World");


        System.out.println(addNums(6, 7));

        System.out.println("done");
    }


    public static String getText(int val) {



//        if (val < 100) {
//            return "less than 100";
//        } else if(val >= 100) {
//            return "not less than 100";
//        } else {
//            System.out.println("Something else");
//        }

//        return "not less than 100";

        if (val < 100) {
            return "less than 100";
        } else if(val >= 100) {
            return "not less than 100";
        }

        return "";
    }

    public static int addNums(int num1, int num2) {
        System.out.println("In add nums");
        return num1 + num2;
    }

    public static void printIt(String text) {
        System.out.println(text);
    }


}
