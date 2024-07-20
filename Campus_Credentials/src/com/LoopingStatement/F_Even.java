package com.LoopingStatement;

public class F_Even {
	 public static void main(String[] args) {
		 int no,sum=0;
		 System.out.println("Enter range : ");
		 no = new java.util.Scanner(System.in).nextInt();
		 for(int i=1;i<=no;i++){
		 if(i%2==0){
		 sum+=i;
		 }
		 }
		 System.out.println(sum);
	}

}
