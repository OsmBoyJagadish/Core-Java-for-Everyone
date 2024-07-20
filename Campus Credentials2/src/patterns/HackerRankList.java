package patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankList {

	public static void main(String[] args) {
		System.out.println("Enetr no. of elemnts");
		Scanner sc = new Scanner(System.in);

		int numElements = sc.nextInt();

		ArrayList<Integer> L1 = new ArrayList<>();

		for (int i = 0; i < numElements; i++) {
			int element = sc.nextInt();
			L1.add(element);
		}
		
		System.out.println("No. of operation");
		int queries = sc.nextInt();
		sc.nextLine();
		if (queries == 2) {
			
			System.out.println("What to do");
			String ss = sc.nextLine();
			if (ss.equalsIgnoreCase("Insert")) {
				int index = sc.nextInt();
				int newElement = sc.nextInt();
				L1.add(index, newElement);
			}else{
				System.out.println("No option available");
			}
			sc.nextLine();
			System.out.println("What to do");
			String s1 = sc.nextLine();
			if (s1.equalsIgnoreCase("Delete")) {
				int del = sc.nextInt();
				L1.remove(del);
			}else{
				System.out.println("No option available");
			}
		} else {
			System.out.println("Enter 2 queries only");
		}

		for (int num : L1) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
}