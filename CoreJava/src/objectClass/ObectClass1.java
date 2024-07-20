package objectClass;

//Object class is Parent class to all the classes.
//Object class is just a normal class, The equals() method in String class checks
//cONTENT Only but in Object class it will Check CONTENT and REFERENCE Both.
//equals() and == are same for this normal class

class Osm{
	public void sayHello(){
		System.out.println("Osm Boy");
	}
}

public class ObectClass1 extends Osm{
	
	@Override
	public void sayHello(){
		System.out.println("Sneha");
	}
	
//	@Override
//	  public boolean equals(Object obj) {
//        return true;
//    }
	
	public static void main(String[] args) {
		
		String name="jagadish";
		System.out.println(name);
		
		ObectClass1 o=new ObectClass1();
		ObectClass1 o1=new ObectClass1();
		o.sayHello();
		
		System.out.println(o.equals(o1));
	}

}
