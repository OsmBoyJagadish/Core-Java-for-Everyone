package leetCode;

public class LeetCodee_2000 {
	 public String reversePrefix(String word, char ch) {
		 String s = "";
		 String temp = "";
		 int k=-1;
	        for(int i=0;i<word.length();i++){
	            if(word.charAt(i)==ch){
	            	k=i;
	                for(int j=i;j>=0;j--){
	                    s = s + word.charAt(j);
	                }
	                temp = temp + word.substring(i + 1);
	                break;
	            }
	            
	        }
	        if (k == -1) {
	            return word;
	        }
	        return s+temp;
	    }
	 
	 public static void main(String[] args) {
		 LeetCodee_2000 name = new LeetCodee_2000();
		 String result = name.reversePrefix("xyxzxe", 'z');
	     System.out.println(result);
	}
}
