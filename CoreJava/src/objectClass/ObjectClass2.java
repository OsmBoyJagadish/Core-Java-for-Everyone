package objectClass;

public class ObjectClass2 {
	
	
//	static ObjectClass2 o2;
	public static void main(String[] args) {
		
		ObjectClass2 o=new ObjectClass2();
		ObjectClass2 o1=new ObjectClass2();

		System.out.println("equals and == are same for normal class");
		System.out.println(o==o1);
		System.out.println(o.equals(o1));
		
		System.out.println(o);
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		
		String s=new String("navin");
		String s1=new String("navin");
		
		System.out.println(s.hashCode()+" "+ s1.hashCode());
		
		System.out.println(s);
		System.out.println(s.toString());

	}

}
