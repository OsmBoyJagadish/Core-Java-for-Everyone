package com.controlStatement;

public class Q4 {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		int no = new java.util.Scanner(System.in).nextInt();
		
		if(no%2==0){
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd");
		}
	}
}
