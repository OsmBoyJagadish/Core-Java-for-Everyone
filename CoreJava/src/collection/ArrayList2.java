package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<Integer> nos=new ArrayList<>();
		
		nos.add(10);
		nos.add(20);
		nos.add(20);
		nos.add(30);
		nos.add(1);
		
		
		
		System.out.println(nos);
		
		Collections.sort(nos);
		System.out.println(nos);
		
		System.out.println(nos.toString());
		
		for(int i:nos){
			System.out.println(i);
		}
		
		Iterator<Integer> itr=nos.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		ListIterator<Integer> Litr=nos.listIterator();
		while(Litr.hasNext()){
			System.out.println(Litr.next());
		}
		
		
		ListIterator<Integer> L=nos.listIterator(nos.size());
		while(L.hasPrevious()){
			System.out.println(L.previous());
		}
		
		

	}

}
