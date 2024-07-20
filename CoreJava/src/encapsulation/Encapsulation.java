package encapsulation;

public class Encapsulation {
	
	private int M1;
	private int M2;
	private int M3;

	public int getM1(){
		return M1;
	}
	
	public void setM1(int M1){
		//if(M1>10){
			this.M1 = M1;
		//}
	}
	
	public int getM2() {
		return M2;
	}
	
	public void setM2(int M2) {
		this.M2 = M2;
	}
	
	public int getM3() {
		return M3;
	}
	
	public void setM3(int M3) {
		this.M3 = M3;
	}
	
//	alt+shift+s --> generate getter setter
//	or Source--> generate setter getter
	
	public static void main(String[] args) {
		
		Encapsulation E=new Encapsulation();
		E.setM1(50);
		System.out.println(E.getM1());
		
		
	}
}
