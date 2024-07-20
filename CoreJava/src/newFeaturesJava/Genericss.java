package newFeaturesJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Genericss {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("Jagadish");
		names.add("");
		
		System.out.println(names);
		
		System.out.println("Enter number between 1-3: ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		sc.close();
		
		switch(i){
			case 1: 
				System.out.println("One");
			break;
			case 2: 
				System.out.println("Two");
			break;
			case 3: 
				System.out.println("Three");
			break;
			default: 
				System.out.println("Please Enter Appropriate Number");
			
		}

	}

}
