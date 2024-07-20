package lambdaExpression;

interface Sayable{
	public String say(String name);
}

public class Lambdaaa2 {
	public static void main(String[] args) {
		
		Sayable s=(name)->{
			return "Hello "+name;
		};
		System.out.println(s.say("Jaggu"));
		
		Sayable s1=name->{
			return "Hello "+name;
		};
		System.out.println(s1.say("Jaggu"));
	}
}
