package com.amogh.quest2;

public class Scientific extends Basic implements ScientificCalculator{
	@Override
	public void square(int x) {
	int result = x * x;
	System.out.println("Square: " + result);
	}

	@Override
	public void cube(int x) {
	int result = x * x * x;
	System.out.println("Cube: " + result);
	}
	
	}

	
