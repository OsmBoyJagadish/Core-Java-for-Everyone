package com.LoopingStatement;

import java.util.Scanner;

public class F_Facto {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter x : ");
		 int x = sc.nextInt();
		 int range = sc.nextInt();
		 sc.close();

		 double sum=1;
		 for(int i=1;i<=range;i++){
		 int no=i;
		 int fact=1;
		 while(no>0){
		 fact=fact*no;
		 no--;
		 }
		 sum=sum+(Math.pow(x,i))/fact;
		 }
		 System.out.println(sum);
	}

}
