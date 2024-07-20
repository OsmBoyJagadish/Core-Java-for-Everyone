package dynamicPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci();
	}

	public static void fibonacci() {
		System.out.println("Enter any number : ");
		int n = MainRunnerClass.sc.nextInt();

		int a = 0, b = 1, c, i;
		for (i = 1; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
