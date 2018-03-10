package com.java.eight.funtionalInterface.implementations;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumerImplementations {
	/**
	 * You use a Consumer when you want to do something with a parameter but not
	 * return anything. BiConsumer does the same thing except that it takes two
	 * parameters
	 */
	public static void main(String[] args) {
		
		Consumer<String> printer = x -> System.out.println(x);
		printer.accept("XYZ");

		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> keyValueMapper = (k, v) -> map.put(k, v);
		keyValueMapper.accept("one", 1);
		keyValueMapper.accept("two", 2);
		
		System.out.println(map);

	}

}
