package TakingInput;

import java.util.Scanner;

public class ByScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int i=sc.nextInt();
		System.out.println("Your number is : "+i);
		sc.close();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=sc1.nextLine();
		System.out.println("Your name is : "+name);
		sc1.close();

	}

}
