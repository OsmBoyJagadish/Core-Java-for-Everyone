package testseries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Jagadish");
		name.add("Shivam");
		name.add("Shiv");
		
		for(String i: name){
			System.out.println(i);
		}
				
		for(int j=0;j<=name.size()-1;j++){
			System.out.println(name.get(j));
		}
		
		int k=0;
		while(k<=name.size()-1){
			System.out.println(name.get(k));
			k++;
		}
		
		Iterator<String> itr=name.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		ListIterator <String> Litr=name.listIterator();
		while(Litr.hasNext()){
			System.out.println(Litr.next());
		}
		
		name.forEach(
			(n)->{
				System.out.println(n);
			}
		);

	}

}
