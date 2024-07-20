package stream;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,6,4,9,1);

		nums.stream()
		.filter(n -> n%2==1)
		.sorted()
		.map(n -> n*2)
		.forEach(n -> System.out.println(n));
		
	}
}
