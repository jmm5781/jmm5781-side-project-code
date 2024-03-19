package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	public static final int FREEZING_TEMPERATURE = 32;
	public static final double C_TO_F_MULTIPLIER = 1.8;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		// ignoring input type and number range check here
		// try/catch for input type
		// temp should be > absolute zero
		int temperatureInput = Integer.parseInt(input.nextLine());

		boolean validInput = false;
		while (!validInput) {
			System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
			char temperatureScaleInput = input.nextLine().toUpperCase().charAt(0);

			if (temperatureScaleInput == 'F') {
				convertFtoC(temperatureInput);
				validInput = true;
			} else if (temperatureScaleInput == 'C') {
				convertCtoF(temperatureInput);
				validInput = true;
			} else {
				System.out.println("Invalid temperature scale entered, please enter C or F.");
			}

		}
	}

	public static void convertFtoC(int temperatureFahrenheit) {
		double temperatureCelsius = (temperatureFahrenheit - FREEZING_TEMPERATURE) / C_TO_F_MULTIPLIER;
		System.out.println(temperatureFahrenheit + "F is " + (int)temperatureCelsius + "C.");
	}


	public static void convertCtoF(int temperatureCelsius) {
		double temperatureFahrenheit = (temperatureCelsius * C_TO_F_MULTIPLIER + FREEZING_TEMPERATURE);
		System.out.println(temperatureCelsius + "C is " + (int)temperatureFahrenheit + "F.");
	}


}
