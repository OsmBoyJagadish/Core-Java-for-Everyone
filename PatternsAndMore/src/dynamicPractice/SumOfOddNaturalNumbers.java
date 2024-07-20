package dynamicPractice;

public class SumOfOddNaturalNumbers {
	public static void main(String[] args) {
		sumOfOddNaturalNumbers();
	}

	public static void sumOfOddNaturalNumbers() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();

		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			if ((i % 2) != 0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
