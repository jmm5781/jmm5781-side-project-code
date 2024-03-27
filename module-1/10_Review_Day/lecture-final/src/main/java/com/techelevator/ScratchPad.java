package com.techelevator;

public class ScratchPad {


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Yoav");
        person1.setSsn("xxx-xx-xxxx");

        Person person2 = new Person();
        person2.setName("Linda");
        person2.setSsn("xxx-xx-xxdx");


        Person person3 = new Person();
        person3.setName("Yoav");
        person3.setSsn("xxx-xx-xxxx");


        System.out.println("Compare using ==");
        System.out.println();

        System.out.println("person1 == person3: " + (person1 == person3));


        System.out.println("Compare using default equals");
        System.out.println();

        System.out.println("person1.equals(person3): " + (person1.equals(person3)));

        System.out.println(person1);

        Person person4 = null;

//        System.out.println(person4.);
        if (person4 != null) {
            System.out.println(person4.equals(person1));
        }





    }


}
