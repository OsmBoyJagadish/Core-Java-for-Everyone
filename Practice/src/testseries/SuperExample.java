package testseries;

class Dynamic{
	String course="Java";
}

class Smart extends Dynamic{
	String course="HTML";
	
	void printCourse(){  
		System.out.println(course); 
		System.out.println(super.course);
		}  
}

public class SuperExample {
	public static void main(String[] args) {
		Smart s=new Smart();
		s.printCourse();
	}
}
