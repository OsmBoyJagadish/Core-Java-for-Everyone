package dynamicPractice;

public class FactorsOfNumber {

	public static void main(String[] args) {
		factorsOfNumber();
	}

	public static void factorsOfNumber() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if(n % i== 0) {
				System.out.println(i);
			}
		}
	}
}
