//strong Number is a special number whose sum of the factorial of digits is equal to the original number.
//Eg: 145=1!+4!+5!=145

package dynamicPractice;

public class StrongNumbers {
	public static void main(String[] args) {
		strongNumber();
	}

	public static void strongNumber() {
		System.out.println("Enter any number : ");
		int n = MainRunnerClass.sc.nextInt();
		
		int i,r,fact=1,temp,sum=0;

		temp=n;
		while(n>0){
			r=n%10;
			for(i=r;i>=1;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		n=temp;
		
		if(n==sum){
			System.out.println("It is Strong number");
		}else{
			System.out.println("It is not a strong number");
		}
	}
}
