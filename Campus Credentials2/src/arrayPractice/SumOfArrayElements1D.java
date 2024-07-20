package arrayPractice;

public class SumOfArrayElements1D {

	public static void main(String[] args) {
		
		double num[] = {5.5, 9, 4.4, 3, 12.6};
		double result=0;
		for(int i=0;i<num.length;i++){
			result = result + num[i];
		}
		System.out.println(result);

	}
}
