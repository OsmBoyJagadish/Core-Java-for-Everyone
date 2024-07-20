package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Lambdaaa4 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Jagadish");
		s.add("Shivam");
		s.add("Omkar");
		s.add("Shiv");
		
		s.forEach(
			(n)->{
				System.out.println(n);
			}
		);
	}
}
