package arrayPractice;

public class OccurrenceOfElements {
	public static void main(String[] args) {
		
		int a[]={9,2,7,5,7,2,1,5};
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			System.out.println(a[i]+ " "+ count);
		}
	}
}
