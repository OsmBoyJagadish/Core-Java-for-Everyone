package newFeaturesJava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTest{
	
	public static void main(String[] args) {
		
		Consumer<String> C=(name)->{
			System.out.println("Im "+name);
		};
		C.accept("Jagadish");
		
		Function<String,String> F=(names)->{
			return "Me "+names;
		};
		System.out.println(F.apply("Jagadish"));
		
		Supplier<String> S=()->{
			return "Osm";
		};
		System.out.println(S.get());
		
		Predicate<Integer> P=(n)->{
			return n>10;
		};
		System.out.println(P.test(34));
		
	}

}
