package interfaceExample;

interface mathsBasic {
	void Addition(int a, int b);
	void Subtract();
	void Division();
	void Multiply();
}

class mathsExample implements mathsBasic{
	
	@Override
	public void Addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void Subtract(){
		int a=11,b=2,c;
		c=a-b;
		System.out.println("a-b="+c);
	}
	
	public void Division(){
		int a=11,b=2,c;
		c=a/b;
		System.out.println("a/b="+c);
	}
	
	public void Multiply(){
		int a=11,b=2,c;
		c=a*b;
		System.out.println("a*b="+c);
	}
	
	public void Modulo(){
		int a=11,b=2,c;
		c=a%b;
		System.out.println("a%b="+c);
	}
	
	public static void main(String args[]){
		System.out.println("Let's see some calculations.");
		System.out.println("Take Reference a=11 and b=2");
		mathsExample m=new mathsExample();
		m.Addition(8,8);
		m.Subtract();
		m.Division();
		m.Multiply();
		m.Modulo();
	}

	
	
}