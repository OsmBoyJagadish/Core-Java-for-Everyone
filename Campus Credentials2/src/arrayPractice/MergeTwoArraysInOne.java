package arrayPractice;

import java.util.*;

public class MergeTwoArraysInOne {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 2 };

		int arr3[] = new int[9];

		System.arraycopy(arr1, 0, arr3, 0, 5);
		System.arraycopy(arr2, 0, arr3, 5, 4);

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
