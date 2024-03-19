package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		/*
			List should be created using the class type

			List<String> names = new ArrayList<String>();

			Java can deduce the type of List being created based
			on what it is being assigned to so you can omit the
			class type on the right hand side of the assignment like so:

			List<String> names = new ArrayList<>();

			This is what you will usually see an is considered best
			practice since the type is redundant in this case

			List have been around since before the time when you
			could associate a type with them. It is VALID to write

			List whatIsItList = new ArrayList()

			but the compiler will warn you and you should NOT DO THIS
			unless you have a very good reason not to as many of the methods
			in List make assumptions about data types on the type param in the
			point brakcets ( i.e. List<Integer> )
		 */



//		names.add

//		List<Integer> myNums = new ArrayList<>();
//		myNums.add


		List<String> names = new ArrayList<>();

		String name1 = "Yoav";
		String name2 = "Lisa";
		String name3 = "Rachael";

		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add("Linda");

//		System.out.println(names.get(1));


//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}





		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		// the order of the list is guaranteed
		printStrings(names);

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");


		names.add("Rachael");

		// Lists are reference types so if a name is added in a method
		// it will still be there when it gets back to the calling code

		addCindy(names);

		printStrings(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		// This will insert at index 2 in the current list
		// Whatever was there at index and on will be moved forward
		names.add(2, "Barbara");

		printStrings(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(5);

		printStrings(names);
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean barbaraInList = names.contains("Barbara");
		System.out.println("barbaraInList: " + barbaraInList);
		System.out.println("cotnains Alex: " + names.contains("Alex"));

		/*

		System.out.println("####################");
		names.add("Rachael");
		printStrings(names);
		System.out.println("Removing...");
		names.remove("Rachael");
		printStrings(names);

		 */




		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfBarbara = names.indexOf("Barbara");
		System.out.println("indexOfBarbara: " + indexOfBarbara);

		int indexOfZeus = names.indexOf("Zeus");
		System.out.println("indexOfZeus: " + indexOfZeus);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		// Converts to array. Note the odd parameter
		//
		// This specifies the type of array. The size in brackets
		// is ignored.. use any number (though usually 0)
		String[] namesAsArray = names.toArray(new String[0]);

		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		// Lists are NOT immutable. This will actually CHANGE
		// the List order
		Collections.sort(names);
//
		printStrings(names);


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		// Reverses current List. is NOT a sort
		Collections.reverse(names);

		printStrings(names);


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


		// Good for iterating through all data
		//
		// This will pull out once element at a time
		// and assign it to a local variable to use in the block
		// of code
		//
		// You cannot use this kind of loop if:
		// 1. You need to know the index (you don't have access to it here)
		// 2. You need to modify the data. The data here is a copy
		// and will NOT update the original data
		for (String curName : names) {
			System.out.println(curName);
		}

		System.out.println("####################");
		for (int index = 0; index < names.size(); index++)  {
			System.out.println((index + 1) + ". " + names.get(index));
		}

		for (String curName : namesAsArray) {
			System.out.println("Array: " + curName);
			curName = "";
			System.out.println("Array after: " + curName);
		}

		for (String curName : namesAsArray) {
			System.out.println("Final: " + curName);
		}


		System.out.println("####################");

	}

	public static void printStrings(List<String> data) {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

	public static void addCindy(List<String> data) {
		data.add("Cindy");
	}
}
