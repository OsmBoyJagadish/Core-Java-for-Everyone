package collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<String> rotis=new Stack<>();
		
		rotis.push("Roti-1");
		rotis.push("Roti-2");
		rotis.push("Roti-3");
		rotis.push("Roti-4");
		rotis.push("Roti-5");
	    
		System.out.println(rotis);
		
		rotis.pop();
		System.out.println(rotis);
		rotis.pop();
		System.out.println(rotis);
		
 		System.out.println(rotis.peek());
 		
		System.out.println(rotis);
		
	}

}
