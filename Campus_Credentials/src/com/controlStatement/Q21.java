package com.controlStatement;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amt=sc.nextInt();
		System.out.println("Enter Range: ");
		int note=sc.nextInt();

		switch(note){
		case 2000: int n1=amt/2000;
				   amt=amt%2000;
				   System.out.println(n1);
		case 500: int n2=amt/500;
				  amt=amt%500;
				  System.out.println(n2);
		case 200: int n3=amt/200;
				   amt=amt%200;
				   System.out.println(n3); 
		case 100: int n4=amt/100;
				   amt=amt%100;
				   System.out.println(n4);
		case 50: int n5=amt/50;
				   amt=amt%50;
				   System.out.println(n5);
		case 20: int n6=amt/20;
				   amt=amt%20;
				   System.out.println(n6);
		case 10: int n7=amt/10;
				   amt=amt%10;
				   System.out.println(n7);
		case 5: int n8=amt/5;
				   amt=amt%5;
				   System.out.println(n8);
		case 2: int n9=amt/2;
				   amt=amt%2;
				   System.out.println(n9);
		case 1: int n10=amt/1;
				   amt=amt%1;
				   System.out.println(n10);
				   break;
		default: System.out.println("Invalid");
		}
		sc.close();
	}
}
