package starHash;

public class StarHashPattern {

	public static void main(String[] args) {
		
		int row,column;
		for(row=1;row<=4;row++){
			for(column=1;column<=3;column++){
				if(row%2==0){
				System.out.print("#");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
