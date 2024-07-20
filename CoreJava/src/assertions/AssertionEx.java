package assertions;

import java.util.Scanner;

public class AssertionEx {
	public static void main(String[] args) {
//		System.out.println(args);
//		for(String value:args){
//			System.out.println(value);
//		}
		
		System.out.println("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		sc.close();
		
		assert age>=18;
		
		System.out.println(age);
	}

}
