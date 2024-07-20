package com.LoopingStatement;

public class Facto {
	public static void main(String[] args) {
		 int no,rem,fact=1;
		 System.out.println("PLease Enter numbers : ");
		 no=new java.util.Scanner(System.in).nextInt();
		 while(no>0){
		 rem=no%10;
		 fact=fact*rem;
		 no--;
		 }
		 System.out.println(fact);

	}

}
