package allQuestions;
public class Q3_Solution {
    public static void main(String[] args) {
    	
        long number = 600851475143L;
        long largestPrimeFactor = getLargestPrimeFactor(number);
        System.out.println("Largest Prime Factor is: " + largestPrimeFactor);
    }

    public static long getLargestPrimeFactor(long n) {
        long largestPrime = -1;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestPrime = n;
        }

        return largestPrime;
    }
}
