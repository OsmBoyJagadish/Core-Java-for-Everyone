package abstractclass;

abstract class jaggu{
	abstract void sayHello();
}


public class basic extends jaggu{
	@Override
	void sayHello(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println("main");
		basic b;
		b=new basic();
		b.sayHello();
	}

}
