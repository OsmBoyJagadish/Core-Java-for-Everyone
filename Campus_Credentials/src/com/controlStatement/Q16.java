package com.controlStatement;

public class Q16 {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		int angle = new java.util.Scanner(System.in).nextInt();
		
		if(angle==90){
			System.out.println("It is Right Angled Triangle");
		}else if(angle<90){
			System.out.println("It is Acute Angled Triangle");
		}else{
			System.out.println("It is Obtuse Angled Triangle");
		}
	}
}
