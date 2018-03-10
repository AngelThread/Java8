package com.java.eight.funtionalInterface.implementations;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementatingFunctionAndBiFunction {

	public static void main(String[] args) {

		Function<String, Integer> findLength = x -> x.length();
		int length = findLength.apply("12345");
		System.out.println("Does length of  \"12345\" 5 ? :" + (length == 5));
		int lengthReverse = findLength.apply("654321");
		System.out.println("Does length of  \"654321\" 5 ? :" + (lengthReverse == 5));

		BiFunction<String, String, String> concator = (s1, s2) -> s1 + s2;
		System.out.println("What is One + Two ? :" + concator.apply("One", "Two"));
	}
}
