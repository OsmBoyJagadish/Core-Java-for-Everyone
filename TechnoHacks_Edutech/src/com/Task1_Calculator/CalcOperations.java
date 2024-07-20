package com.Task1_Calculator;

import java.util.Scanner;

public class CalcOperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Basic Mathematical Calculator!");
		
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();

		System.out.println("Please Select an operation: ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");

		int choice = sc.nextInt();
		double result = 0;

		switch (choice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Error");
			} else {
				result = num1 / num2;
				break;
			}
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("Your Desired Output is " + result);
	}
}
