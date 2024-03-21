package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public void demoClass() {

        System.out.println("##############################################################################");
        System.out.println("        Creating an instance of TechElevatorStudent");
        System.out.println("##############################################################################");
        System.out.println();

        // Create a new instance to a TechElevatorStudent (uses default constructor)*/


        /*
        System.out.println();
        System.out.println("################# Get data using setter methods #######################");
        // Set the instance data using setter methods - these are the instance's properties or state
        */



        /*
        System.out.println();
        System.out.println("################# Get data using getter methods #######################");
        // Read instance data using getter methods
        */


        /*
        System.out.println();
        System.out.println("################# Get data using derived getter methods #######################");
        // Getters can be derived - not tied to a property but based on other properties
        */


        /*

        System.out.println("##############################################################################");
        System.out.println("        Class methods are its behavior");
        System.out.println("##############################################################################");
        System.out.println();

        // Call instance methods (these are the class' behavior)

         */



        /*
        System.out.println("##############################################################################");
        System.out.println("        Classes can override toString method so that");
        System.out.println("        when printing, the object will print meaningful");
        System.out.println("        data rather than it's reference location");
        System.out.println("##############################################################################");
        System.out.println();

         */


        /*
        System.out.println("##############################################################################");
        System.out.println("        We can create constructors with arguments to initialize");
        System.out.println("        data during creation (args constructor");
        System.out.println("##############################################################################");
        System.out.println();

         */



        /*
        System.out.println("##############################################################################");
        System.out.println("        The getters for each instance return the properties of THAT INSTANCE. ");
        System.out.println("        Each instance can have different properties");
        System.out.println("##############################################################################");
        System.out.println();

         */


        /*

        System.out.println("##############################################################################");
        System.out.println("        Calling instance methods for different instances may yield ");
        System.out.println("        different different results if the ");
        System.out.println("        method being called uses instance data");
        System.out.println("##############################################################################");
        System.out.println();

         */



        /*
        System.out.println("##############################################################################");
        System.out.println("        Can create overloaded constructor with default arguments");
        System.out.println("##############################################################################");
        System.out.println();


        // No-argument constructor called but IT calls another constructor to set the studentId
        // to a default String

         */



        /*
        System.out.println("##############################################################################");
        System.out.println("        Class variables (like welcomeMessageText) have ONE value ");
        System.out.println("        across ALL instances");
        System.out.println("##############################################################################");
        System.out.println();

         */

        /*
        System.out.println("##############################################################################");
        System.out.println("     Class methods (like getStatusDescriptionFromStatusCode) do not require  ");
        System.out.println("     an instance and are called using the clasa as well");
        System.out.println("##############################################################################");
        System.out.println();

         */


        /*
        System.out.println("##############################################################################");
        System.out.println("        Class setters can be used to modify class data but ");
        System.out.println("        this should generally be avoided");
        System.out.println("##############################################################################");
        System.out.println();
        
         */


        /*
        System.out.println("##############################################################################");
        System.out.println("        Classes can override equality  so that");
        System.out.println("        when comparing two instance, you define what ");
        System.out.println("        constitutes 2 instances being equals");
        System.out.println("##############################################################################");
        System.out.println();

         */





    }

    private void outputEnrollmentStatuses() {
        System.out.println("--------------------------- ENROLLMENT STATUSES ---------------------------------------");

        for (int code = TechElevatorStudent.INTERESTED; code <= TechElevatorStudent.EMPLOYED; code++) {
            System.out.println(TechElevatorStudent.getStatusDescriptionFromStatusCode(code));
        }

        System.out.println("---------------------------------------------------------------------------------------");
    }





    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.demoClass();
    }
}
