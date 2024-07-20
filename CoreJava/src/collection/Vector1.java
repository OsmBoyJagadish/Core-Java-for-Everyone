package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> name=new Vector<>();
		name.add("Jagadish");
		name.add("Sneha");
		name.add("Shiv");
		
		System.out.println(name);
		
		for(int i=0;i<name.size();i++){
			System.out.println(name.get(i));
		}
		
		Enumeration<String> enm=name.elements();
		while(enm.hasMoreElements()){
			System.out.println(enm.nextElement());
		}

	}

}
