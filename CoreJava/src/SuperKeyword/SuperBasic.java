package SuperKeyword;

class Computer{
	int fee=2000;
	Computer(){
		System.out.println("Computer Constructor");
	}
	public void sayHello(){
		System.out.println("Computer hello");
	}
}
public class SuperBasic extends Computer{
	int fee=3000;
	SuperBasic(){
		System.out.println("Basic constructor");
	}
	SuperBasic(int i){
		System.out.println("Basic Consttructor"+i);
	}
	public void sayHello(){
		super.sayHello();
		System.out.println("Basic hello");
	}
	public void displayFee(){
		System.out.println(super.fee);
		sayHello();
	}
	public static void main(String[] args) {
		SuperBasic s= new SuperBasic();
		s.displayFee();

	}
}
