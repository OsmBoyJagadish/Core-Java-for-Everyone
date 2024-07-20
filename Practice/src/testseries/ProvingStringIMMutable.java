package testseries;

public class ProvingStringIMMutable {
	
	public static void main(String[] args) {
		String s1="Jagadish";
		String s2="Jagadish";
		System.out.println(s1==s2);
		
		s1=s1+"article";
		System.out.println(s1==s2);
		
		String s3=new String("Osm");
		String s4=new String("osm");
		System.out.println(s3=s4);
		
	}

}
