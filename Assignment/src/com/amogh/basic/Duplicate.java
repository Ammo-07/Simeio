package com.amogh.basic;

public class Duplicate {
	public static void main(String[] args) {

		int i = 0, j, dup_count = 0;
		int[] Dup_Count_arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 60};

		while(i < Dup_Count_arr.length)
		{
		j = i + 1;
		while(j < Dup_Count_arr.length)
		{
		if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
		dup_count++;
		break;
		}
		j++;
		}
		i++;
		}
		System.out.println("\nThe Total Number of Duplicates = " + dup_count);
		}
}
