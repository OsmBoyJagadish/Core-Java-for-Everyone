package dynamicPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153, r, c, sum = 0, temp;

		temp = n;

		while (n > 0) {
			r = n % 10;
			c = r * r * r;
			sum = sum + c;
			n = n / 10;
		}

		n = temp;

		if (n == sum) {
			System.out.println("It is a armstrong number");
		} else {
			System.out.println("It is not a armstrong number");

		}
		
	}
}
