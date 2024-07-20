package lambdaExpression;

public class Lambdaaa6 {
	public static void main(String[] args) {
		
		Runnable r=()->{
			System.out.println("Thread Created Successfully");
		};
		Thread t=new Thread(r);
		t.start();
		
	}
}
