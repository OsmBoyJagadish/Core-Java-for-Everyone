package collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prac1 {
	public static void main(String[] args) {
		Set<Integer> sett=new HashSet<>();
		sett.add(10);
		sett.add(40);
		sett.add(400);
		sett.add(4);
		sett.add(0);
		sett.add(null);
		System.out.println(sett);
		
		List<Integer> lisstt=new ArrayList<Integer>();
		lisstt.add(10);
		lisstt.add(19);
		System.out.println(lisstt);
		
		Set<Integer> unique=new HashSet<>(lisstt);
		System.out.println(unique);
		
		Set<Character> u=new HashSet<>();
		String name="raama";
		for(char c:name.toCharArray()){
			if(u.contains(c)){
				System.out.println("duplicate="+c);
			}else{
				u.add(c);
			}
		}
		System.out.println(u);
		
	}
}
