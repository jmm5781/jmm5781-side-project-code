package com.techelevator;

public class ObjectsDemo {


    public static void main(String[] args) {
        System.out.println("Hello");
//        saySomething();

        // instantiate a non-static version so that we can call non-static methods

        ObjectsDemo demo = new ObjectsDemo();
        demo.saySomething();


    }

    public void saySomething() {
        System.out.println("Something");
    }
}
