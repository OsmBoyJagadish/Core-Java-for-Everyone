package com.LoopingStatement;

public class Q1 {
	public static void main(String[] args) {

		int no, last, first = 0, sum;

		System.out.println("Enter number : ");
		no = new java.util.Scanner(System.in).nextInt();

		last = no % 10;

		while (no > 0) {
			first = no % 10; // 4 7 6 5
			no = no / 10;
			if (no == 0) {
				break;
			}
		}
		sum = last + first;
		System.out.println(sum);
	}
}
