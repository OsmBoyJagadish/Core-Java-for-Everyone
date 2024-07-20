package allQuestions;

public class Q3 {
	public static void main(String[] args) {
		System.out.println("ok");
		long i, n = 600851475143L,largest = 0;
		for (i = 1; i <= n; i++) {
			long count=0;
 			if (n % i == 0) {
				for (long j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					largest=i;
				}
			}
		}
		System.out.println("Largest Prime Factor is: "+largest);
		System.out.println("hi");
	}
}
