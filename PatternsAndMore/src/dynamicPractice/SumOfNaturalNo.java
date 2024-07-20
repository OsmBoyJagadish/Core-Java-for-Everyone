package dynamicPractice;

public class SumOfNaturalNo {
	public static void main(String[] args) {
		sumOfNaturalNumbers();
	}

	public static void sumOfNaturalNumbers() {
		System.out.println("Enter Numbers : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
