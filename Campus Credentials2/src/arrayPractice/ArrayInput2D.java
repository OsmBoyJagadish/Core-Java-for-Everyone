package arrayPractice;

public class ArrayInput2D {
	public static void main(String[] args) {
		int a[][] = new int[3][3];

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter array elements : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array elements are : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
