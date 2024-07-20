package practice1;

public class MaxOccurringChar {

	public static void main(String[] args) {

		int count = 0;

		String s = new String("jagadish");

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == j) {
					break;

				} else if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));
				}

			}
		}
	}
}
// System.out.println(s.charAt(i));