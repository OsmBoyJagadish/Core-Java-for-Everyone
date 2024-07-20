package dynamicPractice;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		countNumberOfDigits();
	}

	public static void countNumberOfDigits() {
		System.out.println("Enter Numbers  : ");
		int n = MainRunnerClass.sc.nextInt();

		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
