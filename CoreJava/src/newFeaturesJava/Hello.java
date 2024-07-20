package newFeaturesJava;

public interface Hello {
	
	public void sayHello();
	
	default void SayBye(){
		System.out.println("Bye");
	}
	
	static void SayHi(){
		System.out.println("hi");
	}
	
	

}
