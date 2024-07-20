package dynamicPractice;

public class MultiplicationTable {
	public static void main(String[] args) {
		tables();
	}

	public static void tables() {
		System.out.println("Enter Number : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int i,Table=0;
		for(i=1;i<=10;i++){
			Table=n*i;
			System.out.println(Table);
		}
	}
}
