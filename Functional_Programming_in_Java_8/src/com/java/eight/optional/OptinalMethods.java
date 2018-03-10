package com.java.eight.optional;

import java.util.Optional;

public class OptinalMethods {

	public static void main(String[] args) {
		Optional<Double> meanOfNull = SampleOptionals.mean(null);

		// java.util.NoSuchElementException: No value present
		Optional.empty().get();

		if (meanOfNull.isPresent()) {
			System.out.println("Mean of Null is " + meanOfNull.get());
		} else {
			System.out.println("Mean of Null is null!");
		}

		Optional<Double> meanOfFirstThree = SampleOptionals.mean(1.0, 2.0, 3.0);
		if (meanOfFirstThree.isPresent()) {
			System.out.println("Mean of meanOfFirstThree is " + meanOfFirstThree.get());
		} else {
			System.out.println("Mean of meanOfFirstThree is null!");
		}

	}
}
