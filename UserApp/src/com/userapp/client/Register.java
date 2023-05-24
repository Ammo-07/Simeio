package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Register {
public static void main(String[] args) {
IValidationService validationService = new ValidationServiceImpl();
Scanner scanner = new Scanner(System.in);

System.out.print("Enter username: ");
String username = scanner.nextLine();

try {
boolean isUsernameValid = validationService.validateUsername(username);
if (isUsernameValid) {
System.out.print("Enter password: ");
String password = scanner.nextLine();
boolean isPasswordValid = validationService.validatePassword(password);
if (isPasswordValid) {
System.out.println("Welcome, " + username + "!");
}
}
} catch (NameExistsException e) {
System.out.println(e.getMessage());
} catch (TooShortException | TooLongException e) {
System.out.println("Invalid password: " + e.getMessage());
}
}
}