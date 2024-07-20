package com.controlStatement;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st marks ");
		int m1 = sc.nextInt();
		System.out.println("Enter your 2nd marks ");
		int m2 = sc.nextInt();
		System.out.println("Enter your 3rd marks ");
		int m3 = sc.nextInt();
		System.out.println("Enter your 4th marks ");
		int m4 = sc.nextInt();
		System.out.println("Enter your 5th marks ");
		int m5 = sc.nextInt();
		
		int total = m1+m2+m3+m4+m5;
		System.out.println(total);
		
		int per = (total*100)/500;
		System.out.println(per);
	}
}
