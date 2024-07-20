package dynamicPractice;

public class FactorialProgram {
	public static void main(String[] args) {
		factorial();
	}

	public static void factorial() {
		System.out.println("Enter any Number : ");
		int n = MainRunnerClass.sc.nextInt();

		int i, fact = 1;
		for (i = n; i >= 1; i--) {
			fact = fact * i;
		}

		// for(i=1;i<=n;i++){
		// fact=fact*i;
		// }

		System.out.println(fact);
	}
}
