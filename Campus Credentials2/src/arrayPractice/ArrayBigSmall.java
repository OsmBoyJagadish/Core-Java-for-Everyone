package arrayPractice;

public class ArrayBigSmall {
	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 7, 9, 1 };
		int small, large, i;
		small = large = a[0];

		for (i = 1; i < a.length; i++) {
			if (small > a[i]) {
				small = a[i];
			}
			if (large < a[i]) {
				large = a[i];
			}
		}
		System.out.println("Small no is: " + small + "\n" + "Big no is: " + large);
	}
}
