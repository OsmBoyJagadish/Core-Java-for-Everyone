package testseries;

public class ArrIndex {
	public static void main(String[] args) {
		
		int arr[]={3,5,6,8,1,2};
		int index=0;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[i-1]){
				index++;
			}else{
				break;
			}
		}
		System.out.println(index);
	}
}
