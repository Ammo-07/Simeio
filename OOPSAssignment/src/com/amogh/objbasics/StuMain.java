package com.amogh.objbasics;
import java.util.*;
public class StuMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student 1 name: ");
		String name1 = scanner.nextLine();
		System.out.print("Enter student 1 department: ");
		String department1 = scanner.nextLine();
		System.out.print("Enter student 1 marks : ");
		String marksInput1 = scanner.nextLine();
		int[] marks1 = parseMarksInput(marksInput1);

		System.out.print("Enter student 2 name: ");
		String name2 = scanner.nextLine();
		System.out.print("Enter student 2 department: ");
		String department2 = scanner.nextLine();
		System.out.print("Enter student 2 marks : ");
		String marksInput2 = scanner.nextLine();
		int[] marks2 = parseMarksInput(marksInput2);

		Student student1 = new Student(name1, department1);
		Student student2 = new Student(name2, department2);

		System.out.println("Student 1 Details:");
		student1.printDetails();
		System.out.println("Grades: " + student1.getGrades(marks1));

		System.out.println("\nStudent 2 Details:");
		student2.printDetails();
		System.out.println("Grades: " + student2.getGrades(marks2));

		scanner.close();
		}

		private static int[] parseMarksInput(String marksInput) {
		String[] marksArray = marksInput.split(" ");
		int[] marks = new int[marksArray.length];
		for (int i = 0; i < marksArray.length; i++) {
		marks[i] = Integer.parseInt(marksArray[i]);
		}
		return marks;
		}
}
