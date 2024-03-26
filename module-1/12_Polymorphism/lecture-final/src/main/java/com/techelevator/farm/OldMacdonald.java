package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		/*
		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig() };

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		 */

		Singable[] singingThings = new Singable[] { new Cow(), new Chicken(), new Pig(), new Tractor() };
		for (Singable singingThing : singingThings) {
			String name = singingThing.getName();
			String sound = singingThing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		List<Singable> singables = new ArrayList<>();
		singables.add(new Tractor());
		singables.add(new Pig());
		singables.add(new Chicken());
		singables.add(new Cow());

		Chicken newChicken = new Chicken();

		Singable thing = singables.get(0);
		System.out.println(thing);
		System.out.println();


		List<Sellable> itemsToSell = new ArrayList<>();
		itemsToSell.add(new Egg());
		itemsToSell.add(new Tractor());
		itemsToSell.add(new Pig());
//		itemsToSell.add(new Chicken());  --> cannot add this because it does not implement Sellable

		for (Sellable item : itemsToSell) {
			System.out.println(item.getName() + ": $" + item.getPrice() );
		}

		System.out.println("******************* Singables ******************"); {
			for (Singable theThing : singables) {
				System.out.println(theThing.getName());

				if (theThing instanceof Chicken) {
					Chicken chicken = (Chicken) theThing;
					chicken.layEgg();

//					((Chicken) singable).layEgg();
				}
			}

		}
	}
}