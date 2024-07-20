package testseries;

public class LeetCode58 {
	public static int lengthOfLastWord(String s) {
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				index++;
			} else if (index > 0) {
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		lengthOfLastWord("Hello World"); 
	}
}
