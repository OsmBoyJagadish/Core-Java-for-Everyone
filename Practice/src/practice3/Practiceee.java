package practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practiceee {

	public static void main(String[] args) {
		List<Integer> nos=new ArrayList<>();
		
		System.out.println("Heyyy, User Enter any Five Numbers");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		int no4=sc.nextInt();
		int no5=sc.nextInt();
		
		nos.add(no1);
		nos.add(no2);
		nos.add(no3);
		nos.add(no4);
		nos.add(no5);
		
		System.out.println(nos);
		
		System.out.println("Enter one more number, same or unique");
		int no6=sc.nextInt();
		
		if(nos.contains(no6)==true){
			System.out.println("Your entered Number is Present");
		}else{
			System.out.println("You entered a unique Number");
		}
		
		
//		if(no6==no1 || no6==no2 || no6==no3 || no6==no4 || no6==no5){
//			System.out.println("Your number found");
//		}else{
//			System.out.println("Number not found, Your just entered : "+no6);
//		}
	}
}
