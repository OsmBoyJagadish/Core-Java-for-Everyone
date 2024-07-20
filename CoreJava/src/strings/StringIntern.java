package strings;

public class StringIntern {

	public static void main(String[] args) {
		
		String s="Jagadish";   //  SCP =String Constant Pool
		String s1="Jagadish";  //  SCP 
		
		String s2=new String("Jagadish"); //heap
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		 
		System.out.println(s==s1); //true
		  
		System.out.println(s1==s2); //false
		 
		s2=s2.intern();
		System.out.println(s1==s2); //true

	}

}
