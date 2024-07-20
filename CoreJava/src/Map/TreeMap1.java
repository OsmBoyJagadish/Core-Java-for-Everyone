package Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> students=new TreeMap<>();
		students.put(5,"Jagadish");
		students.put(2,"Shiv");
		students.put(3,"Omkar");
		students.put(1,"Deval");
		
		System.out.println(students);
				
		for(Entry<Integer,String> s:students.entrySet()){
			System.out.println("Roll no:"+s.getKey()+" Name:"+s.getValue());
		}

	}

}
