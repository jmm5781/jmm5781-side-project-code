package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int maxNumberInput = Integer.parseInt(input.nextLine());
		System.out.println();
		fibonacci(maxNumberInput);
	}

	static void fibonacci(int maxNumber) {
		int[] nums = {0, 1};

		if (maxNumber <= 0) {
			System.out.print("0, 1");
			return;
		}

		if (maxNumber == 1) {
			System.out.print("0, 1, 1");
			return;
		}

		System.out.print("0, 1");
		int sum = 0;
		while (sum <= maxNumber) {
			sum = nums[0] + nums[1];
			nums[0] = nums[1];
			nums[1] = sum;

			if (sum <= maxNumber) {
				System.out.print(", " + sum);
			}
		}

//		nums[0] + 	nums[1]	    = sum
//		0 		+ 	 1 			= 1
//		1 		+ 	 1 			= 2
//		1 		+    2 			= 3
//		2 		+ 	 3 			= 5
//		3 		+ 	 5 			= 8

	}

}

