package sortingAlgorithms;

public class MergeSort {
	
	int array[];
	int tempArr[];
	int length;
	
	public static void main(String[] args) {
		int arr[]={48,36,13,52,19,94,21};
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		
		for(int i:arr){
			System.out.println(i+" ");
		}
	}
	public void sort(int arr[]){
		this.array=arr;
		this.length=arr.length;
		this.tempArr=new int[length];
		divideArr(0, length-1);
	}
	public void divideArr(int lowerIndex, int higherIndex){
		if(lowerIndex<higherIndex){
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArr(lowerIndex, middle);
			divideArr(middle+1, higherIndex);
			mergeArr(lowerIndex, middle, higherIndex);
		}
	}
	public void mergeArr(int lowerIndex, int middle, int higherIndex){
		for(int i=lowerIndex;i<=higherIndex;i++){
			tempArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex){
			if(tempArr[i]<=tempArr[j]){
				array[k]=tempArr[i];
				i++;
			}else{
				array[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]=tempArr[i];
			k++;
			i++;
		}
	}
}
