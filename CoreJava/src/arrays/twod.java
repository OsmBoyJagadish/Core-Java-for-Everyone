package arrays;

	import java.util.Scanner;

	public class twod {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int row = sc.nextInt();
	        int cols = sc.nextInt();

	        int numbers[][] = new int[row][cols];

	        // for input
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < cols; j++) {
	                numbers[i][j] = sc.nextInt();
	            }
	        }

	        // for output
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(numbers[i][j] + " ");
	            }
	            System.out.println(); // Move this outside the inner loop to print a new line after each row
	        }
	    }
	}
