package Propose;

import java.util.Scanner;

public class ILY {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Do You Love Me");
			String input=sc.nextLine();
						
			if(input.equalsIgnoreCase("Yes")){
				System.out.println("Really, Love you so much yaar");
			}else{
				System.out.println("It's Okay");
			}
			sc.close();
		}
		

	}
