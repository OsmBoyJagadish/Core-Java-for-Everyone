package stream;

import java.util.Arrays;

public class ArraysWithStream {
	

	public static void main(String[] args) {
		Integer[] nos={1,2,10,20,100,50};
		
//		for(int i=0;i<nos.length;i++){
//			System.out.println(nos[i]);
//		}
//		
//		for(int i:nos){
//			System.out.println(i);
//		}
		
		Arrays.stream(nos).forEach(
			(n)->{
				System.out.println("Stream = "+n);
			}
		);
		
	}
}
