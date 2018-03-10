package com.java.eight.lambda;

import java.util.function.BiFunction;

public class SampleLambdaExamples {

	public static void main(String[] args) {
		
		//Compiling Error for not effectively final variables in lambdas.
		//args = new String[1];
		BiFunction<String, String, String> sampleBiFunction = (String a, String b) -> {
			return a + b + args[0];
		};
	}

}
