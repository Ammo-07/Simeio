package com.amogh.objbasics;

public class Student {
	private String name;
	private String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Department :"+department);
	}
	public String getGrades(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		double average = sum / marks.length;

		if (average >= 80) {
			return "A";
		} else if (average >= 60) {
			return "B";
		} else if (average >= 40) {
			return "C";
		} else {
			return "Fail";
		}
	}
}
