package com.techelevator.farm;

public class Tractor implements Singable, Sellable {
    @Override
    public String getName() {
        return "Tractor";
    }


    @Override
    public String getSound() {
        return "vroom~";
    }


    @Override
    public double getPrice() {
        return 150000.99;
    }

    public String toString() {
        return "I am a tractor";
    }
}
