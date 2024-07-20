package com.controlStatement;

public class Q17 {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		int no = new java.util.Scanner(System.in).nextInt();
		
		int n1,n2,sum;
		n1=no%10;
		no=no/10;
		n2=no%10;
		sum = n1 + n2;
		
		if(sum>10){
			System.out.println("The number is Greater");
		}else{
			System.out.println("The number is Small");
		}
	}
}	
