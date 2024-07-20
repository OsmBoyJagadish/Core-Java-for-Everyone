package com.LoopingStatement;

public class ArmstrongNo {
	public static void main(String[] args) {
		
		int no, rem, sum = 0, rev = 0;
		
		System.out.println("PLease Enter numbers : ");
		no = new java.util.Scanner(System.in).nextInt();
		
		int temp = no;
		while (no > 0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		no = temp;
		
		if (no == sum) {
			System.out.println("It is a Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
	}
}
