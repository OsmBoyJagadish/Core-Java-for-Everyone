package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers :");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("Your number is :"+no1+","+no2);
		sc.close();
		
		int no3=0;
		try{
			no3=no1/no2;			
		}catch(Exception e){
			System.out.println(e);
//			e.printStackTrace();
//			System.out.println("Wrong number provided"+e.getMessage());
		}
		
		System.out.println("Result is: "+no3);
	}
}
