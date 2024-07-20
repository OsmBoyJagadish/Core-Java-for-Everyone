package collection;

import java.util.ArrayList;

class Jagadish{
	
	public int i=10;
	public int j=20;
	
	@Override
	public String toString(){
		return "i="+i+"j="+j;
		
	}
}

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<Jagadish> name=new ArrayList<>();
		name.add(new Jagadish());
		name.add(new Jagadish());
		
		Jagadish name1=name.get(0);
		Jagadish name2=name.get(1);
		
		for(Jagadish J:name){
			System.out.println(J);
		}
	}
}
