package com.techelevator.farm;

public class Pig extends FarmAnimal implements Sellable {

    public Pig() {
        super("Pig", "oink!");
    }

    @Override
    public double getPrice() {
        return 59;
    }
}
