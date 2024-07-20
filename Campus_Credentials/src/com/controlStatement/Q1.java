package com.controlStatement;

public class Q1 {
	public static void main(String[] args) {
		
		System.out.println("Please Enter a Number : ");
		int no = new java.util.Scanner(System.in).nextInt();
		
		if(no<20){
			System.out.println("The given number is less than 20");
		}else{
			System.out.println("Number is bigger");
		}
	}
}
