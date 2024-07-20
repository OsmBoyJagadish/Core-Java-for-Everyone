package dynamicPractice;

public class SumOfDigits {
	public static void main(String[] args) {
		sumOfDigit();
	}

	public static void sumOfDigit() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int r, sum=0;
		while (n > 0) {
			r = n % 10;
			sum=sum+r;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
