package testseries;

public class SwappingString {
	public static void main(String[] args) {
		
		String a="Coding";
		String b="Ninjas";
		System.out.println("Before Swapping: "+ a+b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swap: "+ a+b);
	}
}
