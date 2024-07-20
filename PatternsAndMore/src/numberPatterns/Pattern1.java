package numberPatterns;

public class Pattern1 {

	public static void main(String[] args) {

		int row, column;
		for (row = 1; row <= 2; row++) {
			for (column = 1; column <= 3; column++) {
				if (row == 1) {
					System.out.print(column);
				} else {
					System.out.print(column + 3);
				}
			}
			System.out.println("");
		}
	}
}
