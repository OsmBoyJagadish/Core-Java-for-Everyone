package com.controlStatement;

public class Q20 {
	public static void main(String[] args) {
		
		System.out.println("Enter day : ");
		String day = new java.util.Scanner(System.in).nextLine();
		
		if(day.equalsIgnoreCase("Saturday")){
			System.out.println("It is a WeekEnd");
		}else if(day.equalsIgnoreCase("Sunday")){
				System.out.println("It is a Holiday");
		}else{
			System.out.println("WeekDay");
		}
	}
}
