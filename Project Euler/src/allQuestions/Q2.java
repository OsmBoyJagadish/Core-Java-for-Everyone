package allQuestions;

public class Q2 {
	public static void main(String[] args) {

		int a = 1, b = 2, c, sum = 0;
		for (int i = a; i <= 4000000; i++) {
			if (a % 2 == 0) {
				if (a < 4000000) {
					sum += a;
				}
			}
			c = a + b;
			a = b;
			b = c;
			if (a > 4000000) {
				break;
			}
		}
		System.out.println("The Sum is: " + sum);
	}
}
