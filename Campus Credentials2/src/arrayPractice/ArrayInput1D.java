package arrayPractice;

public class ArrayInput1D {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter array elements : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
