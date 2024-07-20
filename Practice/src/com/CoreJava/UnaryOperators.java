package com.CoreJava;

public class UnaryOperators {
	public static void main(String[] args) {
		
			int x=10;  
			System.out.println(x++);//10 (11)  
			System.out.println(++x);//12  
			System.out.println(x--);//12 (11)  
			System.out.println(--x);//10  
			
			int i=10;  
			int j=10;
			System.out.println(i++ + ++i);//10+12=22  
			System.out.println(j++ + j++);//10+11=21
			
			int a=10;
			int b=-10;
			boolean c=true;  
			boolean d=false;
			System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
			System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
			System.out.println(!c);//false (opposite of boolean value)  
			System.out.println(!d);//true
	}
}
