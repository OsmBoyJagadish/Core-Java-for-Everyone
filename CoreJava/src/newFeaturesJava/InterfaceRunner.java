package newFeaturesJava;

public class InterfaceRunner {
	public static void main(String[] args) {
		
		Hello h;
		h=new SayInenglish();
		h.sayHello();
		
		h=new SayInSpanish();
		h.sayHello();
		
		Hello.SayHi();
		
		h.SayBye();
		
	}
	
	

}
