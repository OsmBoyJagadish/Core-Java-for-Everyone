package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class Listtt {
	public static void main(String[] args) {
		ArrayList<Integer> nos=new ArrayList<>();
		nos.add(7);
		nos.add(76);
		nos.add(3);
		nos.add(73);
		nos.add(17);
		
		for(int i:nos){
			if(i>10){
				System.out.println(i);
			}
		}
	}

}
