package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();



		System.out.println("######### DECLARING A MAP ##########");

		Map<String, Integer> classCounts = new HashMap<>();
//		Map<String, Integer> classCounts = new HashMap<>();


		System.out.println("######### ADDING AN ENTRY TO A MAP ##########");


		// Keys are Strings, values are Integers as defined by Map<String, Integer>

		classCounts.put("Green", 16);
		classCounts.put("Blue", 17);
		classCounts.put("Purple", 19);

		System.out.println();







		System.out.println("######### ADDING AN ENTRY WITH AN EXISTING KEY WILL UPDATE THE PREVIOUS VALUE ##########");

		// Will change the value of Green from 16 to 15
		classCounts.put("Green", 15);

		// Keys must be unique but you can have duplicate values
//		classCounts.put("Blue", 15);

		System.out.println();




		System.out.println("######### RETRIEVING AN ENTRY FROM A MAP ##########");


		// Will return value of Green
		Integer greenValue  = classCounts.get("Green");

		// Will return null because Red is not a key in the map
		Integer redValue  = classCounts.get("Red");

		Integer myNum = 77;
		// This is basically what unboxing does
		int myNumInt = myNum.intValue();

		Integer greenCountInteger  = classCounts.get("Green");

		// In this instance unboxing will allow you to retieve the Integer and assign it to an int
		int greenCount = classCounts.get("Green");
		System.out.println();

		Integer redCountInteger = classCounts.get("Red");

		// This will cause an error because redCountInteger will be null and so calling the intValue() method
		// on it as unboxing would will cause a NullPointerException which means you tried to access a property or method of nothing
		// which causes an error
//		int redCount = classCounts.get("Red");
		System.out.println();


		System.out.println("######### CHECKING IF A KEY IS IN A MAP ##########");

		int greenInt = 0;
		int redInt = 0;

		System.out.println("classCounts.containsKey(Green): " + classCounts.containsKey("Green"));
		if (classCounts.containsKey("Green")) {
			greenInt = classCounts.get("Green");
		}

		System.out.println("classCounts.containsKey(Red): " + classCounts.containsKey("Red"));
		if (classCounts.containsKey("Red")) {
			redInt = classCounts.get("Red");
		}

		System.out.println();

		// check for null

//		classCounts.put("Red", 29);

		Integer redValue2 = classCounts.get("Red");

		// comfirms that redValue2 is not null before attempting to unbox
		if (redValue2 != null) {
//			redInt = redValue.intValue();
			redInt = redValue;
		}



		System.out.println("######### GETTING THE NUMBER OF ELEMENTS IN A MAP ##########");


		int numOfClasses = classCounts.size();
		System.out.println("numOfClasses: " + numOfClasses);



		System.out.println("######### GETTING ALL THE KEYS IN A MAP ##########");

		Set<String> keys = classCounts.keySet();

		for ( String key : keys  ) {
			System.out.println("Key: " + key + " Value: " + classCounts.get(key));
		}




		System.out.println("######### GETTING ALL THE ENTRIES IN A MAP ##########");

		 Set<Map.Entry<String, Integer>> entries = classCounts.entrySet();


		// Each Entry has a key and a value. You can ask for the key via getKey() and the value
		// via getValue()
		 for ( Map.Entry<String, Integer> curEntry : entries) {
			 System.out.println("Entry key: " + curEntry.getKey());
			 System.out.println("Entry value: " + curEntry.getValue());
		 }
		System.out.println();



		System.out.println("######### REMOVING AN ENTRY A MAP ##########");

//		classCounts.remove("Purple");

		// remove returns the value removed. You can ignore it (as above) or
		// hang on to it as shown here
		Integer valRemoved = classCounts.remove("Purple");;

		// Once removed it should no longer be in the map
		for ( Map.Entry<String, Integer> curEntry : entries) {
			System.out.println("Entry key: " + curEntry.getKey());
			System.out.println("Entry value: " + curEntry.getValue());
		}

		// If you try to retrieve it you will get null
		Integer purpleValAfterRemove = classCounts.get("Purple");
		System.out.println("purpleValAfterRemove: " + purpleValAfterRemove);





		List<String> stoogeNames = new ArrayList<>();
		stoogeNames.add("Larry");
		stoogeNames.add("Curly");
		stoogeNames.add("Moe");

		List<String> spiceNames = new ArrayList<>();
		spiceNames.add("Posh");
		spiceNames.add("Baby");
		spiceNames.add("Scary");
		spiceNames.add("Sporty");
		spiceNames.add("Ginger");

		// You can put ANY type of class/object in as the value - even a List!
		Map<String, List<String>> namesListMap = new HashMap<>();
		namesListMap.put("Stooges", stoogeNames);

		namesListMap.put("Spice Girls", spiceNames);

		List<String> listValue = namesListMap.get("Spice Girls");
		System.out.println("Spice Girls: ");
		for (String name: listValue) {
			System.out.println(name);
		}


		List<String> spiceGirls = namesListMap.get("Spice Girls");
		spiceGirls.add("Yucky");

//		namesListMap.put("Spice Girls", spiceGirls);

		// already has Larry, Curly, Moe


		System.out.println("######### Updated List ##########");
		List<String> spiceGirlsUpdate = namesListMap.get("Spice Girls");
		for (String name: spiceGirlsUpdate) {
			System.out.println(name);
		}



		System.out.println("######### Update count example ##########");


		System.out.println("Before update: ");
		System.out.println();
		for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// classCount has key of String, value of Integer

		// add one to each class
		for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
			// Get current count
			int curValue = entry.getValue();

			//update it
			curValue++;

			//put it back with the same key (will replace previous count)
			classCounts.put(entry.getKey(), curValue);
		}

		System.out.println();
		System.out.println("After update: ");
		System.out.println();
		for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		/*
		for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
			// Get current count
			Integer curValue = entry.getValue();
			curValue++;
			classCounts.put(entry.getKey(), curValue);
		}

		 */

		System.out.println("######### Count names example ##########");


		stoogeNames.add("Larry");
		stoogeNames.add("Larry");
		stoogeNames.add("Bob");
		stoogeNames.add("Curly");



		System.out.println("Stogge names: ");
		System.out.println();
		for(String name : stoogeNames) {
			System.out.println(name);
		}

		// Map to count the occurences of each name
		Map<String, Integer> nameCounts = new HashMap<>();

		// Iterate theough List of names
		for (String name : stoogeNames) {

			// If name is NOT in the map, add the name with a count of 1
			if (!nameCounts.containsKey(name)) {
				nameCounts.put(name, 1);
			} else {
				// If already in the map, retreive the current coumt
				Integer count = nameCounts.get(name);

				// Increment the count
				count++;

				// Update the count for the name in the map
				nameCounts.put(name, count);
			}
		}

		System.out.println();

		System.out.println("Counts: ");
		System.out.println();
		for(Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}




		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();


		System.out.println("######### DECLARING A SET ##########");


		Set<String> nameSet = new HashSet<>();




		System.out.println("######### ADDING AN ELEMENT TO  A SET ##########");


		// Sets do not allow duplicates so second Lisa will be ignored
		nameSet.add("Yoav");
		nameSet.add("Lisa");
		nameSet.add("Rachael");
		nameSet.add("Robert");
		nameSet.add("Lisa");

		System.out.println("Set names: ");
		System.out.println();

		for (String curName : nameSet) {
			System.out.println(curName);
		}

		System.out.println();


		// List allow duplicate
		List<String> nameList = new ArrayList<>();
		nameList.add("Yoav");
		nameList.add("Lisa");
		nameList.add("Rachael");
		nameList.add("Robert");
		nameList.add("Lisa");

		System.out.println("List names: ");
		System.out.println();

		for (String curName : nameList) {
			System.out.println(curName);
		}




		System.out.println("######### CHECKING IF AN OBJECT IS IN A SET ##########");

		System.out.println("nameSet.contains(Robert): " + nameSet.contains("Robert"));
		System.out.println("nameSet.contains(Lulu): " + nameSet.contains("Lulu"));



		System.out.println("######### REMOVING AN ELEMENT FROM A SET ##########");


		nameSet.remove("Lisa");

		for (String curName : nameSet) {
			System.out.println(curName);
		}


		System.out.println("######### GETTING THE NUMBER OF ELEMENTS IN A SET ##########");

		System.out.println("nameSet.size(): " + nameSet.size());



		System.out.println("######### CHECKING FOR NULL ##########");

		String demoNotNull = "Some text";
		String demoNull = "Hijhfdjdhfjdfjhdj";

		System.out.println(demoNotNull.length());

//		System.out.println(demoNull.length());

		if (demoNull != null) {
			System.out.println("demoNull length: " + demoNull.length());
		}

		demoNull = null;

		if (demoNull != null) {
			if (demoNull.length() > 5) {
				System.out.println("Length more than 5");
			}
		}

		// Can use "short-circuit logic" to check for null and check some condition at the same time
		//
		// If the demoNull IS null, the second expression (with the problematic method call) will not be evaluated
		// because if the first expressiom is false there is no way the && can be true regardless of the
		// evaluation of the second expression

		if (demoNull != null && demoNull.length() > 5) {
			System.out.println("Length more than 5");
		} else {
			System.out.println("Length not more than 5");
		}






		/*

		// For Yoav ... Why does this not work????
		for (String key : classCounts.keySet()) {
			Integer intUsingKey = classCounts.get(key);
			intUsingKey++;
			System.out.println();
		}

		for (String name : stoogeNames) {
			name += "!";
		}



		System.out.println("######### Update using For Loop ##########");

		for (int i = 0; i < classCounts.size(); i++) {
			Integer num = classCounts.get(i);
			System.out.println(num);

		}


		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(7);
		nums.add(19);

		for (Integer curNum : nums) {
			System.out.println(curNum);;
		}

		for (int i = 0; i < nums.size(); i++) {
			Integer curVal = nums.get(i);
			curVal++;
		}

		for (Integer num : nums) {
			System.out.println(num);
		}

		 */

	}

}
