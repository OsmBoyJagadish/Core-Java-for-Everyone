package regexxx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample {
	public static void main(String[] args) {
		
//1st way
		Pattern p=Pattern.compile(".sa");
		Matcher m= p.matcher("dsa");
		System.out.println(m.matches());
		
//2nd way		
		System.out.println(Pattern.compile(".sa").matcher("fsa").matches());
		
//3rd way		
		System.out.println(Pattern.matches(".sa","gsa"));
		
	}
}
	