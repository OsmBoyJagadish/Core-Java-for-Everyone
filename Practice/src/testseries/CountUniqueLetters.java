package testseries;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountUniqueLetters {

	public static void main(String[] args) {
		
		System.out.println("enter the String name: ");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
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
