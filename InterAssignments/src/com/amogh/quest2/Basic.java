package com.amogh.quest2;

public class Basic implements BasicCalculator {
	@Override
	public void add(int x, int y) {
	int result = x + y;
	System.out.println("Addition: " + result);
	}

	@Override
	public void difference(int x, int y) {
	int result = x - y;
	System.out.println("Difference: " + result);
	}

	@Override
	public void product(int x, int y) {
	int result = x * y;
	System.out.println("Product: " + result);
	}

	@Override
	public void divide(int x, int y) {
	if (y != 0) {
	int result = x / y;
	System.out.println("Division: " + result);
	} else {
	System.out.println("Cannot divide by zero.");
	}
	}
}
