package com.controlStatement;
public class Q10 {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		int marks = new java.util.Scanner(System.in).nextInt();
		
		if(marks<35){
			System.out.println("You are fail");
		}else if(marks<=50 && marks>35){
			System.out.println("Grade E");
		}else if(marks<=60 && marks>50){
			System.out.println("Grade D");
		}else if(marks<=70 && marks>60){
			System.out.println("Grade C");
		}else if(marks<=85 && marks>70){
			System.out.println("Grade B");
		}else if(marks<=100 && marks>85){
			System.out.println("Grade A");
		}
	}
}
