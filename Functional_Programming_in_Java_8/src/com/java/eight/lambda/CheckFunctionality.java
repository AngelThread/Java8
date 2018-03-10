package com.java.eight.lambda;

@FunctionalInterface
public interface CheckFunctionality {
	boolean check(Animal a);

	default String functionalityName() {

		return "Functionality Name";
	}

	default String functionalityDescription() {

		return "Functionality Description";
	}
}
