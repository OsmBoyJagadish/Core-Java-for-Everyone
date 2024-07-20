package arrayPractice;

import java.util.Arrays;

public class CopyOfMethod {
	public static void main(String[] args) {
		int arr[]=new int[]{2,4,6,4,2,10};
		int arr2[] = Arrays.copyOf(arr, 6);
		System.out.println(Arrays.toString(arr2));
		int arr3[]=new int[10];
		System.arraycopy(arr2, 0, arr3, 0, 6);
		System.out.println(Arrays.toString(arr3));
	}

}
