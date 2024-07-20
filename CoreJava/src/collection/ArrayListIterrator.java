package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterrator {

	public static void main(String[] args) {
		
		List<Integer> nos=new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(100);
		nos.add(200);
		nos.add(1);
		
		System.out.println("Using toString Method");
		System.out.println(nos.toString());
		
		System.out.println("\nUsing for each loop");
		for(int i:nos){
			System.out.println(i);
		}
		
		System.out.println("\nUsing Iterator Method");
		Iterator<Integer> itr=nos.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("\nUsing listIterator in forward direction");
		ListIterator<Integer> ListItr=nos.listIterator();
		while(ListItr.hasNext()){
			System.out.println(ListItr.next());
		}
		
		System.out.println("\nUsing ListIterator in reverse");
		ListIterator<Integer> revItr=nos.listIterator(nos.size());
		while(revItr.hasPrevious()){
			System.out.println(revItr.previous());
		}
		
		System.out.println("\n"+nos.size());
		
	}

}
