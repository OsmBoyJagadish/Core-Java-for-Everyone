package dynamicPractice;

public class SumOfSquareOfNaturalNo {
	public static void main(String[] args) {
		sumOfSquareOfNaturalNumbers();
	}

	public static void sumOfSquareOfNaturalNumbers() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int i,sum=0,square=0;
		for(i=0;i<=n;i++){
			square=i*i;
			sum=sum+square;
//			System.out.println(square);
		}
		System.out.println(sum);
	}
}
