package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow cow = new Cow();
		Chicken chicken = new Chicken();
		chicken.setSleeping(true);
		Pig pig = new Pig();
		Cat theCat = new Cat();
		theCat.setSleeping(true);

//		FarmAnimal animal = new FarmAnimal("Animal", "animal noise!");

		/*
		Singable[] singables =
//				new Singable[] { animal, cow, chicken, theCat, pig, new Tractor()};
				new Singable[] { cow, chicken, theCat, pig, new Tractor()};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}

		 */

		FarmAnimal[] animals = new FarmAnimal[] { cow, theCat, pig, chicken };

		for (FarmAnimal animal : animals) {
			System.out.println(animal.getName());
			animal.eat();;
		}

	}
}