package primeNo;

public class PrimeNumber1 {

	public static void main(String[] args) {

		int n, i, count = 0,Numbers=0;

		for (n = 1; n <= 100; n++) {
			count = 0;
			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				Numbers++;
				System.out.println(n);
			}
		}
		System.out.println("There are "+""+Numbers+""+ " Prime numbers");
	}
}
