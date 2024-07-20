package arrayPractice;

public class SumOfArrayElements2D {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int sum=0;

 		java.util.Scanner sc = new java.util.Scanner(System.in);
 		System.out.println("Enter array elements : ");

 		for(int i=0;i<3;i++){
 			for(int j=0;j<3;j++){
 			a[i][j]=sc.nextInt();
 		}
 	}

 	System.out.println("Sum of elements are : ");
 		for(int i=0;i<a.length;i++){
 			for(int j=0;j<3;j++){
 			sum+=a[i][j];
 			}
 		}
 		System.out.println(sum);
 	}
}
