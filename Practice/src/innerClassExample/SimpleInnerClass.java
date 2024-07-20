package innerClassExample;

public class SimpleInnerClass {
	
	String type="Class";
	
	class Inner{
		void sayHello(){
			System.out.println("Im inner "+type);
		}
	}
	
	public static void main(String[] args) {
		SimpleInnerClass s=new SimpleInnerClass();
		SimpleInnerClass.Inner in = s.new Inner();
		in.sayHello();
		
	}
}
