package javaTest;

import java.util.Scanner;

public class StringPalindromer {

	public static void main(String[] args) {

		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		sc.close();

		StringBuilder reversed = new StringBuilder(original);
		System.out.println(reversed.reverse());

		if (original.equals(reversed.toString())) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}
