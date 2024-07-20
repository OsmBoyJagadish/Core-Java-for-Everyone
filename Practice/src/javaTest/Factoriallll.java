package javaTest;

import java.util.Scanner;

public class Factoriallll {

	public static void main(String[] args) {

		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, fact = 1;
		for (i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
