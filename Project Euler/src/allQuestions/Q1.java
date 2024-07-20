package allQuestions;

public class Q1 {
	public static void main(String[] args) {
		
		int sum=0;
		for(int a=1;a<1000;a++){
			if(a%3==0 || a%5==0){
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
