package com.java.eight.funtionalInterface.implementations;

@FunctionalInterface
public interface OurTripleFunction<T, U, V, R> {
	R perform(T t, U u, V v);
}
