package strings;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		
        String s="deval mishra or harsh mishra";
		
        StringTokenizer str = new StringTokenizer(s, " ");
        
		System.out.println(str);
		System.out.println(str.toString());
		
//		for(;str.hasMoreTokens();){
//			System.out.println(str.nextToken());
//		}
		
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken());
		}
		
		String []array=s.split(" ");
		for(String k:array){
			System.out.println(k);
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		int i2[]={1,2,3,4,5};
		
		for (int i : i2) {
			System.out.println(i);
		}
	}
}

