package strings;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		String s=new String();
		s=s.concat("deval");
		s=s.concat("mishra");
		System.out.println(s); //deval  mishra
	    
		StringBuffer sbf=new StringBuffer(s);
		System.out.println(sbf.reverse());
		
		StringBuilder sbl=new StringBuilder();
		sbl.append("deval");
		sbl.append("mishra");
	
		System.out.println(sbl);
		

	}

}
