package Overriding;

 class Parent{
	 int i=10;
	 void sayHello(){
	 System.out.println("splendor");
 }
 }
 class Parent1 extends Parent{
	 int i=10;
	 void sayHello(){
		 System.out.println("BMW");
	 }
 }
public class BasicOverriding extends Parent1{
    int i=50;
    //overriding
    void sayHello(){
    	System.out.println("Bullet");
    }
	public static void main(String[] args) {
		BasicOverriding b=new BasicOverriding();
		System.out.println(b.i);
		b.sayHello();
}

}
