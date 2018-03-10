package com.java.eight.optional;

import java.util.Optional;

public class SampleOptionals {

	public static void main(String[] args) {

	}

	public static Optional<Double> mean(double... values) {
		if (values == null || values.length == 0) {
			return Optional.empty();
		}
		double total = 0.0;
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
		return Optional.of(total / values.length);

	}

}
