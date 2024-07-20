package lambdaExpression;

interface drawable{
	public void draw();
}

public class Lambdaaa {
	public static void main(String[] args) {
		
		int unit=10;
		
		drawable d=()->{
			System.out.println("Drawing "+unit);
		};
		d.draw();
	}
}
