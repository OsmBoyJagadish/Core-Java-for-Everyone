package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(1);
		nos.add(98);
		nos.add(1);
		
		System.out.println("Before Sorting");
		System.out.println(nos);
		
		Collections.sort(nos);
		System.out.println("After Sorting");
		System.out.println(nos);

	}

}
