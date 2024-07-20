package newFeaturesJava;


@FunctionalInterface
interface Deval{
	int score=0;
	String doNothing(); //SAM
}

public class LambdaPoints {
	public static void main(String[] args) {
		Deval d=()-> "I am lazy";
		String value=d.doNothing();
		System.out.println(value);
		
	}
}
