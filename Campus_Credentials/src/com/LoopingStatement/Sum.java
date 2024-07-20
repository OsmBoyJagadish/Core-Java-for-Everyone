package com.LoopingStatement;

public class Sum {
	public static void main(String[] args) {
		 int no,rem,sum=0;
		 System.out.println("PLease Enter numbers : ");
		 no=new java.util.Scanner(System.in).nextInt();
		 while(no>0){
		 rem=no%10;
		 sum=sum+rem;
		 no=no/10;
		 }
		 System.out.println(sum);
	}

}
