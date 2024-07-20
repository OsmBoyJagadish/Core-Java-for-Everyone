package strings;

public class StringConcat {

	public static void main(String[] args) {
		

		String fName="Jagadish";
		String lName="Pannala";
		System.out.println(" before concat = "+fName);
		fName=fName.concat(lName); 
		System.out.println("after concat = "+fName);

		System.out.println(fName+" "+lName);
		
		
		String name="Osm";
		name=name+"Boy";
		System.out.println(name); 
		
	}
}
