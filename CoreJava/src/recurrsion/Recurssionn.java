package recurrsion;

public class Recurssionn {
	
	static int no=16;
	static boolean flag=false;
	
	public static void main(String[] args) {
		printNo();
	}
	
	static void printNo(){
		System.out.println(no);
		if(no<=0 || flag){
			flag=true;
			no=no+5;
		}else{
			no=no-5;
		}
		if(no<=16){
			printNo();
		}
	}
}
