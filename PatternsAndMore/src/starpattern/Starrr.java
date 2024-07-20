package starpattern;

public class Starrr {

	public static void main(String[] args) {
		
		int row,col;
		for(row=1;row<=4;row++){
			for(col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
