package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> nos=new TreeSet<>();
		nos.add(40);
		nos.add(40);
		nos.add(10);
		nos.add(23);
		nos.add(70);
		
		System.out.println(nos);
		
	    System.out.println(nos.descendingSet());
		System.out.println(nos.tailSet(40));
		System.out.println(nos.headSet(10));
		System.out.println(nos.clone());
		System.out.println(nos.contains(8));
		
		System.out.println(nos.pollFirst());
		System.out.println(nos.pollLast());
		
//		Iterator i=nos.descendingIterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
		
		
//		Set<String> name=new TreeSet<>();
//		name.add("Jagadish");
//		name.add("shivam");
//		name.add("Shiv");
//		name.add("Deval");
//		name.add("Navin Sir");
//		
//		System.out.println(name);
//		
//		
//		
//		Iterator<String> itr=name.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		

	}

}
