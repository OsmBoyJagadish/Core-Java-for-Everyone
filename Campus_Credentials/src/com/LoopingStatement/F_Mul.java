package com.LoopingStatement;

import java.util.Scanner;

public class F_Mul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x  : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int mul=0;
		for(int i=1;i<=b;i++){
			mul=mul+a;
		}
		System.out.println(mul);
	}

}
