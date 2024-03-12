package com.techelevator;

public class Lecture {

	public static void main(String[] args) {



		// single line comment ( // before text to comment out)

//		 Hello there!
//				ddddd

		// block comment, starts with /*   and  ends with   */

		/*
		 Hello there!
				ddddd
				fjj

		 */

		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises = 26;

//		System.out.println(numberOfExercises);

//		System.out.println(numberOfExercises);

		System.out.println(numberOfExercises);

		numberOfExercises = 35;

		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "TechElevator";

		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;

		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";

		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		double pi = 3.1416;

//		pi = 5.5;
		System.out.println(pi);

		// constants use snake case convention

		final double THE_NUMBER_PIE = 3.1416;

		/*
			because THE_NUMBER_PIE was declared as final, we cannot update it
		 	once it has a value
		 */

//		THE_NUMBER_PIE = 5.5;


		System.out.println(THE_NUMBER_PIE);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myName = "Yoav";

		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		int numberOfButtons = 2;

		System.out.println(numberOfButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		int wholeNumPercentLeft = 90;

		double percentLeft = .9;

		System.out.println(wholeNumPercentLeft);


		///

		System.out.println(5 + 6);




		// modulo operator

		int quotient = 7 / 4;

		int remainder = 7 % 4;

		System.out.println(quotient);
		System.out.println(remainder);

		/* operator/assignment operattos */

		int firstNum = 5;

		System.out.println(firstNum);

//		firstNum = firstNum + 3;

		firstNum += 3;

		System.out.println(firstNum);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int diff1 = 121 - 27;

		System.out.println(diff1);


		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

		double sum1 = 12.3 + 32.1;

		System.out.println(sum1);

		/*
		12. Create a String that holds your full name.
		*/
		String fullName = "Yoav Morahg";
		System.out.println(fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String helloFullName = "Hello " + fullName;

		System.out.println(helloFullName);

		/*
		14. Add ", Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		fullName = fullName + ", Esquire";

		System.out.println(fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

//		System.out.println(fullName + ", Esquire");

		fullName += ", Esquire";

		System.out.println(fullName);


		byte byte1 = 1;

		byte byte2 = 8;

//		byte byteSum = byte1 + byte2;

		int  byteSum = byte1 + byte2;


//		byte byteSum2 =  (byte) (byte1 + byte2);


		long val1 = 4;
		int val2 = 7;

		/// this won't work because result is promoted to long
//		int intLongSum = val1 + val2;

		long longSum = val1 + val2;

		double doubleNum = 2.0;


//		long longDoubleSum = longSum + doubleNum;

		double longDoubleSum = longSum + doubleNum;

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

		String saw = "Saw";

		saw += 2;

		// because saw is a String, the number 2 was concatenated on the end
		// as a String rather than attempting to do math
		System.out.println(saw);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

		saw += 0;

		System.out.println(saw);

		/*
		18. What is 4.4 divided by 2.2?
		*/

		System.out.println(4.4 / 2.2);

		/*
		19. What is 5.4 divided by 2?
		*/

		System.out.println(5.4 / 2);

		/*
		20. What is 5 divided by 2?
		*/

		System.out.println(5 / 2);

		double divValue = 5 / 2.0;

		System.out.println(divValue);



		int castInt = (int) divValue;
		System.out.println(castInt);


		System.out.println(5 / (double) 2);


		System.out.println((double) (5 / 2));

		/*
		21. What is 5.0 divided by 2?
		*/

		System.out.println(5.0 / 2);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		System.out.println(66.6 / 100);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/

		System.out.println(5 % 2);

		/*
		24. What is 1,000,000,000 * 3?
		*/
		System.out.println(1000000000 * 3);

		System.out.println((long)1000000000 * 3);

		System.out.println(1000000000L * 3);

		/*
		25. Create a variable that holds a boolean called isDoneWithExercises and
		set it to false.
		*/
		boolean isDoneWithExercises = false;
		/*
		26. Now set isDoneWithExercise to true.
		*/
		isDoneWithExercises = true;
		
	}

}
