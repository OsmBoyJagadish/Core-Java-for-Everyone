package com.LoopingStatement;

public class F_Fibo {
	public static void main(String[] args) {
		 int a=0,b=1,c,no;
		 System.out.println("Enter range : " );
		 no=new java.util.Scanner(System.in).nextInt();

		 for(int i=1;i<=no;i++){
		 System.out.println(a);
		 c=a+b;
		 a=b;
		 b=c;
		 }
	}

}
