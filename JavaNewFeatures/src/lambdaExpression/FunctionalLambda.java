package lambdaExpression;


@FunctionalInterface
public interface FunctionalLambda {
	
	abstract void sayHello(String name);
	
	default void sayHell(){
		System.out.println("Go to Hell");
	}
	
	static void sayCome(){
		System.out.println("Come here");
	}

}

interface NONO{
	
	abstract void say();
	
}


interface WRNO{
	
	int saySay();
}


interface WRWA{
	
	int add(int a,int b);
}