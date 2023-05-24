package com.amogh.scanner;
import java.util.*;
public class Login {
	public static void main(String[] args) {
		String[] usernames = { "Amogh", "Yuvraj", "Abrar", "Jyotheesh" };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter username to login: ");
		String username = scanner.nextLine();

		boolean isValid = false;
		for (String name : usernames) {
		if (name.equalsIgnoreCase(username)) {
		isValid = true;
		break;
		}
		}

		if (isValid) {
		System.out.println("You are logged in successfully.");
		} else {
		System.out.println("Invalid username.");
		}

		scanner.close();
		}
}
