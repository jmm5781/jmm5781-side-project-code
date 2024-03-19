package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	public static final double FEET_PER_METER = 3.2808399;
	public static final double METERS_PER_FOOT = 0.3048;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		int lengthInput = Integer.parseInt(input.nextLine()); // assume input is an int / ignore error checking

		System.out.print("Is the measurement in (m)eters, or (f)eet? ");
		String unitsInput = input.nextLine(); // assume they type m or f

		if (unitsInput.equals("f")) {
			System.out.print(lengthInput + "f is " + (int)(lengthInput * METERS_PER_FOOT) + "m.");
		} else if (unitsInput.equals("m")) {
			System.out.print(lengthInput + "m is " + (int)(lengthInput * FEET_PER_METER) + "f.");
		} else {
			System.out.println("Error, units input incorrectly");
		}
	}

}
