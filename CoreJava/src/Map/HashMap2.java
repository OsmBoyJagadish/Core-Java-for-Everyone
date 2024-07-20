package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		
		List<String> pythonStudent=new LinkedList<>();
		pythonStudent.add("Jagadish");
		pythonStudent.add("Shiv");
		
		List<Integer> fees=new ArrayList<Integer>();
		fees.add(15000);
		
		Map<String,List<String>> totalStudent = new HashMap<>();
		totalStudent.put("Python Students:",pythonStudent);
		
		Map<List<Integer>,Map<String,List<String>>> detail=new HashMap<>();
		detail.put(fees,totalStudent);
		
		System.out.println(detail);
	}
}
