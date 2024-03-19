package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String[] decimalStrings = input.nextLine().split(" ");

		int[] decimalValues = new int[decimalStrings.length];
		for (int i = 0; i < decimalStrings.length; i++) {
			decimalValues[i] = Integer.parseInt(decimalStrings[i]);
		}

		for (int i = 0; i < decimalValues.length; i++) {
			System.out.println(decimalValues[i] + " in binary is " + decimalToBinary(decimalValues[i]));
		}

	}

	static String decimalToBinary(int decimalValue) {
		int dividend = decimalValue;
		int quotient;
		int remainder;
		String binaryResultString = "";

		do {
			quotient = dividend / 2;
			remainder = dividend % 2;
			binaryResultString = String.valueOf(remainder) + binaryResultString;
			dividend = quotient;
		} while (quotient > 0);

		return binaryResultString;
	}

}