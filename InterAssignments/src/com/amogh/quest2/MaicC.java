package com.amogh.quest2;

public class MaicC {
	
		public static void main(String[] args) {
		BasicCalculator basicCalculator = new Basic();
		ScientificCalculator scientificCalculator = new Scientific();

		
		basicCalculator.add(10, 5);
		basicCalculator.difference(10, 5);
		basicCalculator.product(10, 5);
		basicCalculator.divide(10, 5);

		
		scientificCalculator.add(10, 5);
		scientificCalculator.difference(10, 5);
		scientificCalculator.product(10, 5);
		scientificCalculator.divide(10, 5);
		scientificCalculator.square(5);
		scientificCalculator.cube(5);
		}
	}

