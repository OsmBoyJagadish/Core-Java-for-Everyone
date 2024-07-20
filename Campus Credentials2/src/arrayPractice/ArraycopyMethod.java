package arrayPractice;

import java.util.*;

public class ArraycopyMethod {

	public static void main(String[] args) {
		int arr1[] = new int[] { 3, 4, 56, 8, 9, 1 };
		int arr2[] = Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr2));

		int arr3[] = new int[10];
		System.arraycopy(arr2, 0, arr3, 0, 6);
		System.out.println(Arrays.toString(arr3));
	}

}
