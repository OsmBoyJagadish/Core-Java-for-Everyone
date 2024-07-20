package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		
		printArrayForEach(a);
		
		double d[]=new double[2];
		d[0]=20;
		d[1]=20.36;
		
		printArrayForEach(d);
		
		System.out.println("--------------------------");
	
		printArrayNormalLoop(d);
	}
	 
	public static void printArrayNormalLoop(double array[]){
		for(int d=0;d<array.length;d++ ){
			System.out.println("Normal loop = "+array[d]);
		}
		
	}
	public static void printArrayForEach(double arr[]){
		for(double d:arr){
			System.out.println("for Each loop = "+d);	
		}
	}

	public static int [] printArrayForEach(int arr[]){
		for(double d:arr){
			System.out.println("for Each loop = "+d);	
		}
		return arr;
	}	 
}

