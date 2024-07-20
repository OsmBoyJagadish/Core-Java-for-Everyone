package finalKeyword;

public class FinalVariable {
	final int i;
	//static final int i;
	//static{
	//i=50;
	//}
	FinalVariable(){
		i=20;
	}
	FinalVariable(int i){
		this.i=i;
	}

	public static void main(String[] args) {
		FinalVariable F=new FinalVariable();
		System.out.println(F.i);
		

	}

}
