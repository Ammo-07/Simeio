package com.amogh.scanner;
import java.util.*;

public class SumAvg {
	public static void main(String arg[]){
		int size;
		System.out.println("Enter the Size or Array");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int array[]=new int[size];
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
		
		array[i]=sc.nextInt();
		sum=sum + array[i];
		}
		System.out.println("Sum of Array Elements are:"+sum);
		double average=(sum/array.length);
		System.out.format("Average of Array Elements is" +average);
		}
}
