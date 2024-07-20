package com.LoopingStatement;

public class Count {
	public static void main(String[] args) {
		int no, rem, count = 0;
		System.out.println("PLease Enter numbers : ");
		no = new java.util.Scanner(System.in).nextInt();
		while (no > 0) {
			rem = no % 10;
			count++;
			no = no / 10;
		}
		System.out.println(count);
	}
}
