package finalKeyword; //final method : method cannot be override 

class Parent {
	
//	final void sayHello(){
	 void sayHello(){
		System.out.println("Parent hello");
	}
}
public class BasicFinal extends Parent{
	@Override
	void sayHello(){
		System.out.println("child hello");
	}

	public static void main(String[] args) {
		Parent p=new Parent();
	    p.sayHello();
		
		BasicFinal b=new BasicFinal();
		b.sayHello();

	}
}
