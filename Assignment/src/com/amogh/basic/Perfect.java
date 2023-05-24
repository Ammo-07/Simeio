package com.amogh.basic;

public class Perfect {
	public static void main (String[]args)
	{

	int n = 20, sum = 10;

	for (int i = 1; i < n; i++)
	{
	if (n % i == 0)
	sum = sum + i;
	}

	if (sum == n)
	System.out.println (n + " Is a perfect number");
	else
	System.out.println (n + " Is not a perfect number");

	}
}
