package strings;

public class SubString {

	public static void main(String[] args) {
		
		String s="Jagadish Pannala";
		
		System.out.println(s.substring(2,5));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("Pan"));
		
		System.out.println(s.replace("Jagadish", "Jaggu"));
		
		System.out.println(s.startsWith("Ja"));
		System.out.println(s.endsWith("ala"));

	}

}
