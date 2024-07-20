package dynamicPractice;

public class ReverseNumber {
	public static void main(String[] args) {
		reverseNo();
	}

	public static void reverseNo() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int r, rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = r + rev * 10;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
