package strings;

public class AllStringMethods {

	public static void main(String[] args) {
		
		String s0="jagadish pannala";
		String s="jagadish";
		String s1="pannala";
		String s2=new String("JAGADISH");
		String s3=new String("pannala");

		System.out.println(s+" "+s1+" "+s2+" "+s3);

//		char ch=s.charAt(4);
//		System.out.println(ch);
//		System.out.println(s.charAt(4));

//		System.out.println(s.compareTo(s2));
//		System.out.println(s.compareToIgnoreCase(s2));
//		System.out.println(s==s2);
//		System.out.println(s.equals(s2));
//		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.concat(s1));
//		System.out.println(s+" "+s1);
//		String s4=s.concat(s1);
//		System.out.println(s4);
//		System.out.println(s4.concat(s2).concat(s3));
//		System.out.println(s.concat(" ").concat(s1).concat(" ").concat(s2));
		
//		System.out.println(s.contains(s3));
//        System.out.println(s3.contains("pann"));	
//        System.out.println(s.contains("jag"));
//        String s5="I am Hero";
//        if(s5.contains("Hero")){
//        	System.out.println("This String contains Hero");
//        }else{
//        	System.out.println("Hero not found");
//        }
		
//		System.out.println(s.endsWith("sh"));
//		System.out.println(s.startsWith("ja"));
		String s6=String.format("Value of S1: %s  ",s);  //add value in returnTime
		System.out.println(s6);
		String s7=String.format("value is %f",50.987674545456); 
		System.out.println(s7);
		
		byte[] barr=s1.getBytes();
		System.out.println(barr[2]);
		
		byte[] bar=s2.getBytes();
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
//		String s7=new String(bar);   //Getting String back
//		System.out.println(s7);
		
//		String s8=s3.intern();
//		System.out.println(s1==s3);
//		System.out.println(s8==s1);
//		System.out.println(s3.intern()==s1);
		
//		String s9= "";
//		System.out.println(s9.isEmpty());
//		System.out.println(s1.isEmpty());
//		
//		String s10=String.join("-","welcome","my","boy");
//		System.out.println(s10);
//		
//		System.out.println(s1.lastIndexOf("a"));
//		System.out.println(s1.length());
//		
//		System.out.println(s1.replace("p","k"));
//		System.out.println(s1.replace("ala","ada"));
//		System.out.println(s1.replaceAll("pannala","Osm"));
		
		
		

	}
}
