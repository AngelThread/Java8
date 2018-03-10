package com.java.eight.funtionalInterface.implementations;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ImplementationOfUnaryOperatorandBinaryOperator {
	/**
	 * UnaryOperator and BinaryOperator are a special case of a function. They
	 * require all type parameters to be the same type
	 */
	public static void main(String[] args) {
		UnaryOperator<String> upperCase = x -> x.toUpperCase();
		
		System.out.println("abc is converted to upperCase: " + upperCase.apply("abc"));

		BinaryOperator<String> concator = (x, y) -> x.concat(y);
		System.out.println("\"abc\" + \"def\" : " + concator.apply("abc", "def"));
	}
}
