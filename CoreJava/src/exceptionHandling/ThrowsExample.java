package exceptionHandling;

import java.util.Scanner;

public class ThrowsExample {
	
	public static void main(String[] args) throws Exception {
		omkar();
	}
	private static void omkar() throws Exception{
		shivam();
	}
	private static void shivam() throws Exception {
		deval();
	}
	private static void deval() throws Exception{
		int age;
		System.out.println("please enter your age");
		age =new Scanner(System.in).nextInt();

		if(age>18){
				System.out.println("you are adult");
		}else{
				throw new Exception("you are not adult");
			}
	}

}
