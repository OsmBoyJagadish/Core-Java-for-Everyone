package lambdaExpression;

interface Sayablee{
	String sayy(String message);
}

public class Lambdaaa5 {
	public static void main(String[] args) {
		
		Sayablee s1=(message)->{
			
			String str1 = "I would like to say, ";  
            String str2 = str1 + message;
            return str2;
		};
		System.out.println(s1.sayy("time is precious."));
	}
}
