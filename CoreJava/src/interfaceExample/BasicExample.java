package interfaceExample;

interface Basic1 {
	void sayHello(); // automatic abstract method ban gaya 
}

public class BasicExample implements Basic1{
	
	@Override
	public void sayHello() { //public likhna jaruri hai
		System.out.println("ok");
	}
	
	public static void main(String args[]){
		System.out.println("hello");
	}

}