package com.controlStatement;

public class Q8 {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		int no = new java.util.Scanner(System.in).nextInt();
		
		if(no==0){
			System.out.println("Numberb is zero");
		}else if(no<0){
			System.out.println("Number is negative");
		}else{
			System.out.println("Number is Positive");
		}
	}
}
