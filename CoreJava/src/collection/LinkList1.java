package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList1 {

	public static void main(String[] args) {
		
		List<Integer> nos=new LinkedList<>();
		nos.add(10);
		nos.add(20);
		nos.add(30);
		nos.add(50);
		nos.add(100);
		
		System.out.println(nos);
		System.out.println(nos.get(2));
		
		nos=new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(30);
		nos.add(50);
		nos.add(100);
		
		System.out.println(nos);
		System.out.println(nos.get(1));

	}

}
