package collection;

import java.util.LinkedList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		
		List<Student> name=new LinkedList<>();
		Student s=new Student();
		s.name="Jagadish";
		
		Student s1=new Student();
		s1.name="Shiv";
		
		name.add(s);
		name.add(s1);
		System.out.println(name);
		
		for(Student S:name){
			System.out.println(S);
			System.out.println(S.toString());
		}
	}
}
