package com.LoopingStatement;

public class Q2 {
	public static void main(String[] args) {

		int a = 0, b = 1, c, no, sum=0;

		System.out.println("Enter range : ");
		no = new java.util.Scanner(System.in).nextInt();

		for (int i = 1; i <= no; i++) {
			System.out.println(a);
			sum=sum+a;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Sum is : "+sum);
	}
}
