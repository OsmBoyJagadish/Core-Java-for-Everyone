package exceptionHandling;

import java.util.Scanner;

public class TryCatch1 {
	public static void main(String[] args) {
		
		int i[]={1,2,3};
		System.out.println(i[0]);
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		try{
			System.out.println(i[4]);
		}catch(Exception e){
			System.out.println("Give proper Index");
		}
	}
}
