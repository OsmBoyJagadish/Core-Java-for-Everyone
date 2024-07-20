package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap3 {
	public static void main(String[] args) {
		
		Map<Integer,String> name=new HashMap<>();
		
		name.put(1,"Jagadish");
		name.put(2,"Shiv");
		System.out.println(name.size());
		System.out.println(name.containsValue("Jagadish"));
		
		for(Entry<Integer,String> N:name.entrySet()){
			System.out.println(N.getKey()+" "+N.getValue());
		}
		
		
		
	}
}
