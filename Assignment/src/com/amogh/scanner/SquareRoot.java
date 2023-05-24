package com.amogh.scanner;
import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] inputArray = new int[n];
		double[] sqrtArray = new double[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
		inputArray[i] = scanner.nextInt();
		sqrtArray[i] = Math.sqrt(inputArray[i]);
		}

		System.out.println("Square root array:");
		for (int i = 0; i < n; i++) {
		System.out.print(sqrtArray[i] + " ");
		}

		scanner.close();
		}
}
