package MaxPal;

import java.util.ArrayList;
import java.util.List;

public class MaxPalindro {

	public static void main(String[] args) {
		List<Integer> np = new ArrayList<>();
		List<Integer> p = new ArrayList<>();
		for (int i = 99; i >= 10; i--) {
			for (int j = i - 1; j >= 10; j--) {
				int n = i * j;
				if (isPalindromeNo(n)) {
					p.add(n);
				} else {
					np.add(n);
				}
			}
		}
		System.out.println("Palindrome Numbers are : "+p);
		System.out.println("This are not the Palindrome Number"+np);
		System.out.println("palindrome count = " + p.size());
		System.out.println("not a palindrome = " + np.size());
		System.out.println("palindrome = " + p.get(0));

	}

	public static boolean isPalindromeNo(int n) {
		int temp = n,rev=0;
		while (n > 0) {
			int a = n % 10;
			rev = (rev * 10) + a;
			n = n / 10;
		}
		return temp == rev;
	}
}
