package strings;

class Jaggu{
	int i=10;	
}

public class String2 {
	public static void main(String[] args) {
		
		char c[]={'n','a','v'};
		System.out.println(c.length);
		
		String s="navin";
		System.out.println(s.length()); 
        		
		for(int j=0;j<s.length();j++){
			System.out.println(s.charAt(j));
		}
			
		char newchar[]=s.toCharArray();
		System.out.println(newchar);
		
		String newString=new String(newchar);
		System.out.println(newString);				
			}
	}

