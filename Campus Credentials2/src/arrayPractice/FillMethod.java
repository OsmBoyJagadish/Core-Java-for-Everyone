package arrayPractice;

import java.util.*;

public class FillMethod {

	public static void main(String[] args) {
		int arr[] = new int[6];
		Arrays.fill(arr, 100);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Arrays.fill(arr, 3, 6, 50);
		System.out.println(Arrays.toString(arr));

	}
}
