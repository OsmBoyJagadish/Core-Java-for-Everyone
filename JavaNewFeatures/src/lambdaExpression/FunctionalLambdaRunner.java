package lambdaExpression;

public class FunctionalLambdaRunner {
	
//	static FunctionalLambda F = (name) -> {
//		System.out.println("Lambda"+name);
//	};

	public static void main(String[] args) {

		FunctionalLambda F = (name) -> {
			System.out.println("Lambda"+name);
		};

		F.sayHello("Jagadish");
		F.sayHell();
		FunctionalLambda.sayCome();
		
		
		NONO N=()->{
			System.out.println("Say");
		};
		N.say();
		
		
		WRNO W=()->{
			return 6;
		};
		System.out.println(W.saySay());
		
		
		WRWA WA=(a,b)->{
//			System.out.println(a+b);
			return a+b;
		};
		System.out.println(WA.add(10,20));
		
		
	}

}
