package InstanceblockInitializer;

public class Basic {
	int i;
	
	{
		i=20;
		System.out.println(i);
		System.out.println("instance block");
	}
	
	Basic(){
		i=10;
		System.out.println("Constructor");
	}
	Basic(int i){
		System.out.println("Constructor"+this.i);
	}
	static{
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		Basic b=new Basic();
		System.out.println(b.i);
		Basic b1=new Basic();
		System.out.println(b1.i);

	}

}
