package dynamicPractice;

public class SumOfFibo {

	public static void main(String[] args) {
		sumOfFibonacci();
	}

	public static void sumOfFibonacci() {
		System.out.println("Enter any number : ");
		int n = MainRunnerClass.sc.nextInt();

		int a = 0, b = 1, c, i, sum=0;
		for (i = 1; i <= n; i++) {
			System.out.println(a);
			sum=sum+a;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Sum of your fibo series is = "+sum);
	}
}
