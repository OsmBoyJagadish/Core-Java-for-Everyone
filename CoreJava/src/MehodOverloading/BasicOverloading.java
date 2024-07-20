package MehodOverloading;

public class BasicOverloading {
	
	void sayHello(){
		System.out.println("hello");
	}
	void sayHello(int i){
		System.out.println("hello="+i);
	}
	void sayHello(int i,double j){
		System.out.println("int="+i+" double="+j);
	}
	
	public static void main(String[] args) {
		BasicOverloading B=new BasicOverloading();
		B.sayHello();
		B.sayHello(10);
		B.sayHello(10,11.56);
	}

}
