package javaTest;

import java.util.Scanner;

public class ReverseStringgg {
	
public static void main(String[] args) {
		
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		String revName = sc.nextLine();
		sc.close();
		
		for(int i=revName.length()-1;i>=0;i--){
			System.out.print(revName.charAt(i));
		}
		
//		StringBuffer sbf=new StringBuffer(revName);
//		System.out.println(sbf.reverse());
		
//		StringBuilder sbl=new StringBuilder(revName);
//		System.out.println(sbl.reverse());
		
//		int i=revName.length()-1;
//		while(i>=0){
//			System.out.print(revName.charAt(i));
//			i--;
//		}
		
//		int i=revName.length()-1;
//		do{
//			System.out.print(revName.charAt(i));
//			i--;
//		}
//		while(i>=0);
		
	}

}
