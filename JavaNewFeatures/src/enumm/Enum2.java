package enumm;

public class Enum2 {
	
	enum name{
		
		Jagadish,Shiv,Sneha,Shivam,Omkar;
		
		int i=10;
		
		name(){
			System.out.println("Constructor called");
		}
	}
	
	public static void main(String[] args) {
		
		name n,n1;
		n=name.Jagadish;
		System.out.println(n.i);
		
		n1=name.Shiv;
		System.out.println(n.i);
	}

}
