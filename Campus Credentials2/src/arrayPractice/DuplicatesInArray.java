package arrayPractice;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String[] str = {"Jagadish","Prashanth","Soniya","Jagadish","Mahalakshmi","Soniya","Saniya"};
		for(int i=0;i<str.length-1;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j]) && (i !=j)){
					System.out.println("Duplicates are: "+str[j]);
				}
			}
		}
	}
}
