package com.java.eight.funtionalInterface.implementations;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplelmentingPredicateAndBiPredicate {

	public static void main(String[] args) {

		String emptyString = "";
		String notEmptyString = "notEmptyString";

		Predicate<String> emptyChecker = x -> x.isEmpty();
		System.out.println("Is emptyString empty? : " + emptyChecker.test(emptyString));
		System.out.println("Is notEmptyString empty? : " + emptyChecker.test(notEmptyString));

		BiPredicate<String, String> startsWithChecker = (x, y) -> x.startsWith(y);
		System.out.println("Does checker startWith ch? : " + startsWithChecker.test("checker", "ch"));
		System.out.println("Does checker startWith AA? : " + startsWithChecker.test("checker", "AA"));

		BiPredicate<String, String> endsWith = (x, y) -> x.endsWith(y);

		BiPredicate<String, String> startAndEndsWith = endsWith.and(startsWithChecker);
		System.out.println("Does \"strings\" startWith and endWith \"s\"? : " + startAndEndsWith.test("strings", "s"));
		System.out.println("Does \"chars\" startWith and endWith \"s\"? : " + startAndEndsWith.test("chars", "s"));

		// negate is default method of Predicate Interface
		BiPredicate<String, String> endsWithButNotStartsWith = endsWith.and(startsWithChecker.negate());
		System.out.println("Does \"chars\" endWith but not startWith \"s\"? : " + endsWithButNotStartsWith.test("chars", "s"));
		System.out.println("Does \"strings\" endWith but not startWith \"s\"? : " + endsWithButNotStartsWith.test("strings", "s"));

	}
}
