package com.java.eight.funtionalInterface.implementations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierImplementation {

	public static void main(String[] args) {

		Supplier<LocalDate> currentDate = () -> LocalDate.now();

		System.out.println(currentDate.get());

		Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
		ArrayList<String> sample = s1.get();
		System.out.println(sample);

	}

}
