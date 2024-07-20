package searchingAlgorithms;

import java.util.Scanner;

public class BinarySearching {
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50,60,70};
		
		int l=0,h=arr.length-1,m=(l+h)/2;
		
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int Search=sc.nextInt();
		sc.close();
		
//		int Search=50;
		
		while (l <= h) {
			if (arr[m] == Search) {
				System.out.println("Found at "+m);
				break;
			} else if (arr[m] < Search) {
				l = m + 1;
			} else {
				h = m - 1;
			}
			m=(l+h)/2;
		}
		if(l>h){
			System.out.println("Element not found");
		}
	}
}
