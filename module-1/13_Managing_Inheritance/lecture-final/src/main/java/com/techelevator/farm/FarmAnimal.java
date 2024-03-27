package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;

	private boolean sleeping;

//	private List<String> data = new ArrayList<>();

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		this.sleeping = false;
	}
//
//	public boolean isSleeping() {
//		return sleeping;
//	}

	public String getName( ) {
		return name;
	}

	public final String getSound( ) {
		if (sleeping) {
			return "Zzzz!";
		}
		return sound;
	}

//	public void eat() {
//
//	}

	public abstract void eat();
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
}