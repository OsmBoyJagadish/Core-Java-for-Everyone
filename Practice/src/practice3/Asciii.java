package practice3;

import java.util.Scanner;

public class Asciii {

	public static void main(String[] args) {

		System.out.println("Bolo bhaiya, kiska Ascii chahiye ? ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		for (int i = 0; i < s.length(); i++) {
			System.out.print((int) s.charAt(i));
			System.out.print(" ");
		}
	}
}
