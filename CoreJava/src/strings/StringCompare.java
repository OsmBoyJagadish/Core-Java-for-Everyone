package strings;

public class StringCompare {

	public static void main(String[] args) {
		
		String s="NavIn";
		String s1="naVin";
		String s2=new String("navin");
		String s3=new String("navin1");
		String s4=new String("navin");
		
		System.out.println("example===");
		System.out.println(s2==s1);   //false
		System.out.println(s==s1);    //False
		System.out.println(s2==s3);   //false
		System.out.println(s2==s2);   //true
		System.out.println(s3==s4);   //false
		System.out.println(s2==s4);   //false
		
		System.out.println("\n ###equals method##\n");
		System.out.println("s.equals(s1) = "+s.equals(s1));  //False
		System.out.println("s.equalsIgnoreCase(s1) = "+s.equalsIgnoreCase(s1));//True
		System.out.println(s1.equals(s2));//False
		System.out.println(s1.equals(s3));//False
		
		System.out.println("\n ###compare method##\n");
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.compareTo(s3));
	}
}
