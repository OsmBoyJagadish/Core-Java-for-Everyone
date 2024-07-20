package com.LoopingStatement;

public class Mul {
	public static void main(String[] args) {
		 int no,rem,mul=1;
		 System.out.println("PLease Enter numbers : ");
		 no=new java.util.Scanner(System.in).nextInt();
		 while(no>0){
		 rem=no%10;
		 mul=mul*rem;
		 no=no/10;
		 }
		 System.out.println(mul);

	}

}
