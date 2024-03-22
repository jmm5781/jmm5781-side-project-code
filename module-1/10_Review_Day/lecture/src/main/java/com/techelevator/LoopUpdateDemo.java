package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopUpdateDemo {

    public static void main(String[] args) {


        System.out.println("######### LISTS AS KEYS ##########");
        System.out.println();
        // Creating two lists to use as keys

        List<String> listOne = new ArrayList<>();
        listOne.add("One");
        listOne.add("Two");
        listOne.add("Three");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("Four");
        listTwo.add("Five");
        listTwo.add("Six");


        // Put Strings as values with Lists above as keys into Map

        Map<List<String>, String> testMap = new HashMap<>();
        testMap.put(listOne, "One");
        testMap.put(listTwo, "Two");


        // Retreive a value using the actual List used as key (i.e. Same object/memory location)
        String retrievedVal = testMap.get(listOne);
        System.out.println("Using object: " + retrievedVal);

        // Create another List with same data as listOne
        List<String> listThree = new ArrayList<>();
        listThree.add("One");
        listThree.add("Two");
        listThree.add("Three");

        // Retreive a value using the different List with same data used as key (i.e. NOT same object/memory location)
        retrievedVal = testMap.get(listThree);
        System.out.println("Using data: " + retrievedVal);


        System.out.println();
        System.out.println("######### UPDATING IN LOOPS ##########");
        System.out.println();


        Map<String, Integer> classCounts = new HashMap<>();

        classCounts.put("Green", 16);
        classCounts.put("Blue", 17);
        classCounts.put("Purple", 19);

        System.out.println();
        System.out.println("Original number data");
        System.out.println();

        for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
        System.out.println("Attempting to modify Integer data using keySet");
        System.out.println();

        for (String key : classCounts.keySet()) {
            Integer curInt = classCounts.get(key);
            curInt = 8;
        }




        System.out.println();
        System.out.println("After update");
        System.out.println();
        for (Map.Entry<String, Integer> entry : classCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        Map<String, UpdateTester> updateTesters = new HashMap<>();

        UpdateTester tester1 = new UpdateTester(10);
        UpdateTester tester2 = new UpdateTester(35);
        UpdateTester tester3 = new UpdateTester(77);

        updateTesters.put("One", tester1);
        updateTesters.put("Two", tester2);
        updateTesters.put("Three", tester3);

        System.out.println();
        System.out.println("Original data");
        System.out.println();

        for (String key : updateTesters.keySet()) {
            UpdateTester curTester = updateTesters.get(key);
            System.out.println("Key: " + key + " val: " + curTester.getNum());
        }


        System.out.println();
        System.out.println("Attempting to modify UpdateTester data using keySet");
        System.out.println();


        for (String key : updateTesters.keySet()) {
            UpdateTester curTester = updateTesters.get(key);
            curTester.setNum((8));
        }

        System.out.println();
        System.out.println("After update");
        System.out.println();
        for (String key : updateTesters.keySet()) {
            UpdateTester curTester = updateTesters.get(key);
            System.out.println("Key: " + key + " val: " + curTester.getNum());
        }
    }
}
