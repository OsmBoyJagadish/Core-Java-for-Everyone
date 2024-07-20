package dynamicPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		primeNumbers();
	}

	public static void primeNumbers() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int i,count=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		
		if(count==2){
			System.out.println("It is a prime number");
		}else{
			System.out.println("It is not a prime number");
		}
	}
}
