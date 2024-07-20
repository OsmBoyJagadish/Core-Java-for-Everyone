package collection;

import java.util.ArrayList;
import java.util.List;

public class Ciollection2 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Shiv");
		name.add("Jagadish");
		name.add(0,"Shivam");
		name.set(2,"Omkar");
		
		System.out.println(name);
		
		for(String n:name){
			System.out.println(n);
			for(char naam:n.toCharArray()){
				System.out.println(naam);
			}
		}
	}
}
