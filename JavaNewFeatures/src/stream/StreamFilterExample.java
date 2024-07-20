package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample {
	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(30);
		nos.add(100);
		nos.add(1);

		List<Integer> result = new ArrayList<>();

		for (int n : nos) {
			if (n > 10) {
				result.add(n);
			}
		}
		System.out.println(result);

		
		nos.stream().filter((no)->{
			return no>10;
		}).forEach(
			(n)->{
				System.out.println(n);
			}
		);
		
	}
}
