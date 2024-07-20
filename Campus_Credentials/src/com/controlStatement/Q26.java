package com.controlStatement;

import java.util.Scanner;

public class Q26 {
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
		System.out.println("Your Total marks : "+total);
		
		int per = (total*100)/500;
		System.out.println("Percentage is "+per);
		
		System.out.println("Enter your Gender : ");
		char gender=sc.next().charAt(0);
		
		if(per>60 && gender=='m' || gender == 'M'){
			System.out.println("You are eligible for  admission");
		}else if(per>80 && gender=='f' || gender == 'F'){
			System.out.println("You are eligible for  admission");
		}else{
			System.out.println("Not Eligible");
		}
		
	}
}
