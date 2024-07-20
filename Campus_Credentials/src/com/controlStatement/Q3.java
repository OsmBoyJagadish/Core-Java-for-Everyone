package com.controlStatement;

public class Q3 {
	public static void main(String[] args) {
		System.out.println("Please enter Your age : ");
		int age = new java.util.Scanner(System.in).nextInt();
		
		if(age>18){
			System.out.println("Youre eligible for Voting");
		}else{
			System.out.println("Youre not eligible");
		}
	}
}
