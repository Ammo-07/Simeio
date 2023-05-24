package com.amogh.quest1;

public class MainClass {
	



	public static void main(String[] args) {  
		Calculator calculator=(int x,int y)->{ System.out.println("addition:"+(x+y)); };
		calculator.calculate(10, 5); 
	calculator=(int x,int y)->{ System.out.println("subtraction:"+(x-y)); }; 
	calculator.calculate(10, 5); 
	calculator=(int x,int y)->{ System.out.println("multiplication:"+(x*y)); };
	calculator.calculate(10, 5); 
	calculator=(int x,int y)->{ System.out.println("division:"+(x/y)); };
	calculator.calculate(10, 5); }





}

