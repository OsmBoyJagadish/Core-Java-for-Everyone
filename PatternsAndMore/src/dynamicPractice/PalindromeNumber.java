package dynamicPractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		palindro();
	}

	public static void palindro() {
		System.out.println("Enter any number : ");
		int n = MainRunnerClass.sc.nextInt();

		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = r + sum * 10;
			n = n / 10;
		}
		n = temp;

		if (n == sum) {
			System.out.println("It is a palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}

}
