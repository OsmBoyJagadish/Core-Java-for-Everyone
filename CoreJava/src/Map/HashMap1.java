package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> students=new HashMap<>();
		students.put(1,"Jagadish");
		students.put(2,"Shiv");
		students.put(3,"Omkar");
		
		System.out.println(students);
		
		for(Entry<Integer,String> s:students.entrySet()){
			System.out.println("Roll no:"+s.getKey()+" Name:"+s.getValue());
		}
	}
}
