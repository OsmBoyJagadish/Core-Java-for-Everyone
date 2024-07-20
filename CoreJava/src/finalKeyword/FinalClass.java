package finalKeyword; //Final class : we cannot inherit (extends) 


final class Parents{
	String name="hello";
	Integer i;
//	final void sayHello(){
		void sayHello(){
			System.out.println("Parent hello");
		}
	}
//}
public class FinalClass extends Parent{
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.sayHello();
		
		FinalClass F=new FinalClass();
	}
}
