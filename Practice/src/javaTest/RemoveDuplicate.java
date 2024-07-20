package javaTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	  public static void main(String[] args) {
	      int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
	      
	      Set<Integer> set = new HashSet<>();
	      for (int i = 0; i < arr.length; i++) {
	         set.add(arr[i]);
	      }
	      
	      System.out.println("Array with duplicates: " + Arrays.toString(arr));
	      System.out.println("Array without duplicates: " + set);
	   }


}
