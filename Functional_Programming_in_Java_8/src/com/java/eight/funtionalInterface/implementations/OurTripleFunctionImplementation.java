package com.java.eight.funtionalInterface.implementations;

public class OurTripleFunctionImplementation {

	public static void main(String[] args) {
		OurTripleFunction<String, String,String, Integer>
		concatAndReturnLength = (x,y,z) -> (x+y+z).length(); 
	}
}
