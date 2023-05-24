package com.amogh.scanner;
import java.util.*;

public class Registration {
	public static void main(String[] args) {
		String[] usernames = { "Amogh", "Yuvraj", "Abrar", "Jyotheesh" };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name to register: ");
		String name = scanner.nextLine();

		boolean isUnique = true;
		for (String username : usernames) {
		if (username.equalsIgnoreCase(name)) {
		isUnique = false;
		break;
		}
		}

		if (isUnique) {
		System.out.println("You are registered.");
		} else {
		System.out.println("Name is not unique.");
		}

		scanner.close();
		}
}
