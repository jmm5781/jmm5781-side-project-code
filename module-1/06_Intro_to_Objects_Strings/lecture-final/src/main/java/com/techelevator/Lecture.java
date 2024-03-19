package com.techelevator;


import java.math.BigDecimal;
import java.math.MathContext;
import java.util.function.DoubleBinaryOperator;

public class Lecture {

	public static void main(String[] args) {


		/*
		System.out.println("************************************");
		System.out.println("******      PASS BY VALUE     ******");
		System.out.println("************************************");

		int myNum = 5;
		System.out.println();
		System.out.println("myNum before call to passByValue: " + myNum);
		passByValue(myNum);
		System.out.println("myNum after call to passByValue: " + myNum);
		System.out.println();






		System.out.println("************************************");
		System.out.println("******    PASS BY REFERENCE   ******");
		System.out.println("************************************");

		System.out.println();
		int [] myNums = new int [] {1, 2, 3, 4};
		System.out.println("myNums[0] before call to passByReference: " + myNums[0]);
		passByReference(myNums);
		System.out.println("myNums[0] after call to passByReference: " + myNums[0]);



		 */

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String greeting1 = new String("Hello, world!!!!");
		String greeting2 = "Hello!!!!!!!!!";
//		String blah;

		// this is effectively what is happening on line 53;
		String blah = null;
		System.out.println(blah);

//		System.out.println("greeting1: " + greeting1);
//		System.out.println("greeting2: " + greeting2);

//		int [] myNums = new int [] {1, 2, 3, 4};

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		/* Other commonly used methods:
		 *
		 * length
		 * charAt
		 * indexOf
		 * lastIndexOf
		 * substring
		 * startsWith
		 * endsWith
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		// print out lengths of greeting1 and greeting

		System.out.println(greeting1 + " greeting1.length(): " + greeting1.length());
		System.out.println(greeting2 + " greeting2.length(): " + greeting2.length());


		System.out.println();

		// length() returns an int
		int lengthGreeting1 = greeting1.length();
		System.out.println("lengthGreeting1: " + lengthGreeting1);



		System.out.println();

		// charAt returns char at specified index

		System.out.println("greeting1.charAt(7): " + greeting1.charAt(7));




		// index beyond length of String - 1 throws exception

//		System.out.println("greeting1.charAt(7): " + greeting1.charAt(77));


		System.out.println();

		// indexOf returns index of first occurrence of String

		int llIndex = greeting1.indexOf("ll");
		System.out.println("llIndex: " + llIndex);


		System.out.println();

		// indexOf returns -1 if String not found
		int zzIndex = greeting1.indexOf("zQefhrf");
		System.out.println("zzIndex: " + zzIndex);



		System.out.println();

		// indexOf vs. lastIndexOf
		int indexOfO = greeting1.indexOf("o");
		int lastIndexOfO = greeting1.lastIndexOf("o");

		System.out.println("indexOfO: " + indexOfO);
		System.out.println("lastIndexOfO: " + lastIndexOfO);



		System.out.println();

		/* substring returns a portion of a String*/
		String subExample = "Oh my what a week!";
		System.out.println(subExample.substring(6, 10));




		/* overloaded version */

		System.out.println(subExample.substring(6));



		System.out.println();

		/*  String doesn't change when you use substring */

		String subExampleSubString = subExample.substring(6, 10);
		System.out.println(subExample);
		System.out.println(subExampleSubString);



		System.out.println();

		/* you can store in new string if you want to save it */


		System.out.println();

		// you can reassign to same string to deal with immutability */
		subExample = subExample.substring(0, 6);
		System.out.println(subExample);

		String valSample = "Blah!!!";
		System.out.println(valSample);
		valSample = "More blah!";
		System.out.println(valSample);

		System.out.println();


		System.out.println("greeting1.startsWith Hello, : "  + greeting1.startsWith("Hello, "));
		System.out.println("greeting2.startsWith Hello, :" + greeting2.startsWith("Hello, "));

		System.out.println();

// endWidth returns boolean indicating whether String ends with a value

		System.out.println("greeting1.endsWith(\"world\"): " + greeting1.endsWith("world"));
		System.out.println("greeting1.endsWith(\"world!!!!\"): " + greeting1.endsWith("world!!!!"));

		System.out.println();

// toLowerCase returns an all lowercase version of the String
		System.out.println("greeting1.toLowerCase(): " + greeting1.toLowerCase());

		System.out.println();

// toUpperCase returns an all lowercase version of the String
		System.out.println("greeting1.toUpperCase(): " + greeting1.toUpperCase());
		System.out.println();

		String allCaps = greeting1.toUpperCase();
		System.out.println("allCaps: " + allCaps);


		String trimSample = "    Hello!     ";
		System.out.println("trimSample: >>>>" + trimSample + "<<<<");;
		System.out.println("trimSample.trim(): >>>>" + trimSample.trim() + "<<<<");




		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		System.out.println("hello1 " + hello1);
		System.out.println("hello2: " + hello2);

		// Double equals will compare to see if the two variables, hello1 and
		// hello2 point to the same object in memory. Are they the same object?


		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}




		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}


		// So, to compare the values of two objects, we need to use the equals method.
		// Every object type has an equals method


		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}


		// String has equalsIgnoreCase method which ignores the case of the data when
		// checking for equality


		String mixedCase = "Hello, World!";
		String lowerCase = "hello, world!";
		System.out.println("mixedCase.equals(lowerCase): " + mixedCase.equals(lowerCase));
		System.out.println("mixedCase.equalsIgnoreCase(lowerCase): " + mixedCase.equalsIgnoreCase(lowerCase));


		// contains will return a boolean indicating whether String contians the specified String

		String data = "The quick brown fox jumped etc etc";
		System.out.println(data.contains("fox"));
		System.out.println(data.contains("zebra"));



		String myData = "Yoav";
		String otherData = "Yoav";

		if (myData == otherData) {
			System.out.println("These are equal");
		} else {
			System.out.println("These are not equal");
		}

		System.out.println();

		System.out.println();
		System.out.println("*************************");
		System.out.println("****** BIG DECIMAL ******");
		System.out.println("*************************");
		System.out.println();

//
//		double num = 66.6;
//		System.out.println(num /100);

		System.out.println();



		// Create BigDecimal



		double oneHundered = 100;

		BigDecimal bigDec1 = new BigDecimal("66.6");
//		BigDecimal bigDec100 = BigDecimal.valueOf(oneHundered);
		BigDecimal bigDec100 = new BigDecimal(oneHundered);

		System.out.println(bigDec1.add(bigDec100));
		System.out.println(bigDec1);

		// BigDecimal add returns a NEW BigDecimal and does NOT update the original
		// because BigDecimal is immutable
		BigDecimal sum = bigDec1.add(bigDec100);

		// We can reassign reference to original variable to simulate updating
		bigDec1 = bigDec1.add(bigDec100);

		System.out.println();

		System.out.println("***************************************************************");
		System.out.println("************ Problems creating using a double  ****************");
		System.out.println("***************************************************************");

		System.out.println();

		double num1 = 66.6;
		double num2 = 100;

		// create with new BigDecimal and a double param may result in the BigDecimal inheriting the double's issues

		/*
		BigDecimal bigDecimalNum1 = new BigDecimal(num1);
		BigDecimal bigDecimalNum2 = new BigDecimal(num2);
		System.out.println(bigDecimalNum1.divide(bigDecimalNum2));

		 */

		// if using a double to create a BigDecimal, BigDecimal.valueOf will handle this correctly


		BigDecimal bigDecimalNum1 = BigDecimal.valueOf(num1);
		BigDecimal bigDecimalNum2 = BigDecimal.valueOf(num2);
		System.out.println(bigDecimalNum1.divide(bigDecimalNum2));




		System.out.println();


		System.out.println("************************************************");






		System.out.println();


		// Division

		System.out.println(bigDec1.divide(bigDec100));
//		System.out.println(bigDec1.divide(BigDecimal.ONE));


		System.out.println();

		// Constants


		System.out.println(BigDecimal.ZERO);
		System.out.println(BigDecimal.ONE);
		System.out.println(BigDecimal.TEN);



		System.out.println();


		// Comparing
//		bigDec1 = new BigDecimal("66");

		bigDec1 = BigDecimal.valueOf(100);

		System.out.println("bigDec1: " + bigDec1);
		System.out.println("bigDec100: " + bigDec100);


		System.out.println("compareTo: " + bigDec1.compareTo(bigDec100));



		if ( bigDec1.compareTo(bigDec100) > 0) {
			System.out.println("bigDec1 is bigger");
		} else if (bigDec1.compareTo(bigDec100) < 0) {
			System.out.println("bigDec1 is smaller");
		} else {
			System.out.println("they are equal");
		}


		System.out.println();


		/* 	Big Decimal is immutable

			bigDec1.add(bigDec100); will NOT update bigDec1

			must assign to new variable to retain result

		 */

		/*
		BigDecimal answer = bigDec1.add(bigDec100);
		System.out.println("bigDec1: " + bigDec1);
		System.out.println("answer: " + answer);

		 */

		System.out.println();

		//can assign to self to replace reference to be the resulting BigDecimal object

		/*
		System.out.println("bigDec1: " + bigDec1);
		bigDec1 = bigDec1.add(bigDec100);
		System.out.println("bigDec1: " + bigDec1);

		 */
	}

	public static void passByValue(int num) {
		System.out.println("***** IN passByValue *****");
		System.out.println("num: " + num);
		num = 6;
		System.out.println("updated num to: " + num);
		System.out.println("***** OUT passByValue *****");
	}

	public static void passByReference(int [] nums) {
		System.out.println("***** IN passByReference *****");
		System.out.println("nums[0]: " + nums[0]);
		nums[0] = 6;
		System.out.println("updated nums[0] to: " + nums[0]);
		System.out.println("***** OUT passByReference *****");

	}
}
