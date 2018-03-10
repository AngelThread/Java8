package com.java.eight.lambda;

/**
 * The Animal class has three instance variables, which are set in the
 * constructor. 
 * 
 * It has two methods that get the state of whether the animal can hop or swim. 
 * 
 * It also has a toString() method so we can easily identify the Animal in programs. 
 * 
 * We plan to write a lot of different checks, so we want an interface.
 */
public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}