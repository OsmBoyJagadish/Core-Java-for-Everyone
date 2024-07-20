package practice1;

public class BigNumberInArray {
	public static void main(String[] args) {
		int [] n ={1,2,3,56,76,43};
		int max=0;
		for(int i=1;i<n.length;i++){
			if(n[i]>max){
				max=n[i];
			}
		}
		System.out.println(max);
	}
}
