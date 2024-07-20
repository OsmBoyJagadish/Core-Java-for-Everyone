package bindingExample;

public class StaticBinding { //Static/Early/CompileTime/Overloading
	void sayHello(){
		System.out.println("hello");
	}
	void sayHello(String name){
		System.out.println("hello"+name);
	}

	public static void main(String[] args) {
		StaticBinding S=new StaticBinding();
		S.sayHello();
		S.sayHello("Jaggu");

	}

}
