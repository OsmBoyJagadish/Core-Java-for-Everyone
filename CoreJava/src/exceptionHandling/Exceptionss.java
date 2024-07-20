package exceptionHandling;

import java.util.Scanner;

public class Exceptionss {

	public static void main(String[] args) throws Exception {
		
		paisa();

	}

	public static void paisa() throws Exception {
		System.out.println("Please enter your wealth : ");
		Scanner sc=new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();
		
		if(money>100000){
			System.out.println("You're Rich ");
		}else{
			throw new Exception("you are Poor");
		}
	}
	//alt+shift+t   to create method automatically
}
