package starpattern;

import java.util.Scanner;

public class HallowStar {
	public static void main(String[] args) {

		System.out.println("Enter the size of pyramid : ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		sc.close();

		int row, space, star;
		
		for (row = 1; row <= user; row++) {
			for (space = 1; space <= user - row; space++) {
				System.out.print(" ");
			}
			if(row%2==0){
			for (star = 1; star <= ((2 * row) - 1); star++) {
				System.out.print("*");
			}}
			System.out.println("");
		}
	}
}
