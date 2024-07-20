package bindingExample;

class Parent{
	void sayHello(){
		System.out.println("hello parent");
	}
}
class Child extends Parent{
	void sayHello(){
	    System.out.println("hello child");
    }
}


public class DynamicBinding extends Child { //Dynamic/Late/RunTime/Overriding
	@Override		
	void sayHello(){
		System.out.println("Dynamic Binding");
	}

	public static void main(String[] args) {
		Parent d;
		d=new DynamicBinding();
		d.sayHello();
		
		d=new Child();
		d.sayHello();
		
		System.out.println(d instanceof Parent);
	}
}
