package com.amogh.basic;

public class Smallest {

	
	public static void main(String args[]) {
	

	int arr[] = {2, 13, 31, 18, 34, 10};

	int min = arr[0];

	for(int i=0; i<arr.length; i++) { if(min > arr[i])
	{
	min = arr[i];
	}

	}

	System.out.print("Smallest number"+min);
	}
	}

