package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		
		List<Object> names=new ArrayList <>(20);
		names.add("Jagadish");
		names.add("Shiv");
		names.add("Omkar");
		names.add("Shivam");
		names.add("Deval");
		names.add("Harsh");
		names.add(10);
		
		System.out.println(names);
		
		if(names.contains("sneha")){
			System.out.println("sneha present");
		}else{
			System.out.println("sneha absent");
		}
		names.add("sneha");
		if(names.contains("sneha")){
			System.out.println("sneha present");
		}else{
			System.out.println("sneha absent");
		}
		
		System.out.println(names);
		
		names.remove("Shivam");
		names.add(2,"Navin Sir");
		System.out.println(names);
	}
}


