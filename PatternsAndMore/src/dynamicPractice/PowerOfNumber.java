package dynamicPractice;

public class PowerOfNumber {
	public static void main(String[] args) {
		powerOfNumber();
	}

	public static void powerOfNumber() {
		System.out.println("Enter Number : ");
		int n = MainRunnerClass.sc.nextInt();
		System.out.println("Enter the Power of the number: ");
		int m = MainRunnerClass.sc.nextInt();
		
		int i,pow=1;
		if(m==0){
			System.out.println(1);
		}else{
			for(i=1;i<=m;i++){
				pow=n*pow;
			}
			System.out.println(pow);
		}
	}
}
