package practice1;

public class MaxOccuringElement {

	public static void main(String[] args) {
		
		String s="navinaa";
		char temp=' ';
		char perm=' ';
		int count=0,tempCount=0;
		
		for(int i=0;i<s.length();i++){
			temp=s.charAt(i);
			tempCount=0;
			for(int j=i;j<s.length();j++){
				if(temp==s.charAt(j)){
					tempCount++;
				}
				if(tempCount>count){
					count=tempCount;
					perm=temp;
				}
			}
		}
		System.out.println("char="+perm +" count=:- "+count);
	}
}
