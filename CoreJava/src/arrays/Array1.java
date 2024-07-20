package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=0;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		
		System.out.println(a);
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
