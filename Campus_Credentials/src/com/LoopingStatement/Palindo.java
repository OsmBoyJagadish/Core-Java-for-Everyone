package com.LoopingStatement;

public class Palindo {
	public static void main(String[] args) {
		int no, rem, rev = 0;
		System.out.println("PLease Enter numbers : ");
		no = new java.util.Scanner(System.in).nextInt();
		int temp = no;
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		if (rev == temp) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
