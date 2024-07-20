package javaTest;

import java.util.Scanner;

public class PruimeNumberrrr {

	public static void main(String[] args) {

		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, count = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}
}
