package com.java.eight.optional;

import java.util.Optional;

public class OtherOptionalMethods {

	public static void main(String[] args) throws Exception {
		String sampleValue = null;
		Optional<String> opt =  (sampleValue == null)? Optional.empty():Optional.of(sampleValue);
		
		Optional<Double> meanOfFirstThree = Optional.empty();
		System.out.println(meanOfFirstThree.orElseGet(() ->new Double(100)));
		System.out.println(meanOfFirstThree.orElse(new Double(100)));
		System.out.println(meanOfFirstThree.orElseThrow(()-> new Exception("Empty Optional!")));


	}
}
