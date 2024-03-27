package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Exercise {


    /*
    The method average takes in an array of doubles called values.
    Complete the method so that it returns the average (mean) of all
    the numbers in values:

    average([5.0,6.0,7.0]) --> 6.0
    average([2.0,2.0]) --> 2.0
     */
    public double average(double[] values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        double avg = sum / values.length;
        return avg;
    }

    /*
    The method specificGreeting takes in a String called name
    It should return a String containing "Hello Alice!". In this example
    name has the value of "Alice".

    There is only one exception! If name is "Bob", "Hello Robert!" should
    be returned. This is the only exception to the rule.

    greeting("Alice") --> "Hello Alice!"
    greeting("Bob") --> "Hello Robert!"
    greeting("Carly") --> "Hello Carly!"
     */
    public String specificGreeting(String name) {
        if (name.equals("Bob")) {
            name = "Robert";
        }
        return "Hello " + name + "!";
    }

    /*
    The method getEmployeeNames takes in an array containing employee data that looks like this:
    ["001", "Alice", "1234 Somewhere St.", "002", "Bob", "3214 Nowhere Lane", "003", "Carly", "211 Deer Haven Lane"]

    As you can see, the data for each employee is organized in clusters of three cells:
    - position 0 is the employee ID
    - position 1 is employee name
    - position 2 is employee address
    ... and we  start off with another employee id at position 3

    The method should return a List containing only the employee names:
    getEmployeeName( ["001", "Alice", "1234 Somewhere St.", "002", "Bob", "3214 Nowhere Lane"])
    -->
    {"Alice", "Bob"}
     */

    public List<String> getEmployeeNames(String [] data) {

        List<String> employeeNames = new ArrayList<>();
        
        for (int i = 0; i < data.length; i++) {
            if (i % 3 == 1) {
                employeeNames.add(data[i]);
            }
        }

        return employeeNames;
    }

}
