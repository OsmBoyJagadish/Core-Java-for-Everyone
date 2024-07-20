package com.LoopingStatement;

import java.util.Scanner;

public class F_Series {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter x : ");
		 int x = sc.nextInt();
		 int range = sc.nextInt();
		 sc.close();

		 double sum=1;
		 for(int i=1;i<=range;i++){
		 sum=sum+(Math.pow(x,i))/i;
		 }
		 System.out.println(sum);
	}

}
