package practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountUniqueLetter {
	
	public static void main(String[] args) {

		String input = "navinnnn";
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String s : input.split("")) {
			if (map.containsKey(s)) {
				int count = map.get(s);
				count++;
				map.put(s, count);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}


}
