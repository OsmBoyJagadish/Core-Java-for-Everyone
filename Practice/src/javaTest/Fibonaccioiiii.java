package javaTest;

import java.util.Scanner;

public class Fibonaccioiiii {
	
	public static void main(String[] args) {
		
	
	 System.out.println("Enter numbers : ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
		
		
	int a = 0, b = 1, c, i;
	for (i = 1; i <= n; i++) {
		System.out.println(a);
		c = a + b;
		a = b;
		b = c;
	}
	}
}
