package searchingAlgorithms;

import java.util.Scanner;

public class LinearSearching {
	public static void main(String[] args) {
		
		int arr[]={10,20,5,60,40,100,65};
		boolean bool=false;
		
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		sc.close();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==input){
				bool=true;
			}
		}
		if(bool==true){
			System.out.println("no. is present");
		}else{
			System.out.println("No is not present");
		}
	}
}
