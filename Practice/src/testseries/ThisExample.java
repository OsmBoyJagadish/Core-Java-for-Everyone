package testseries;

class Employee{
	
	String name;
	float sal;
	int age;
	
	Employee(String name,float sal,int age){
		this.name=name;
		this.sal=sal;
		this.age=age;
	}
	void display(){
		System.out.println(name+" "+sal+" "+age);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Employee e1=new Employee("Jagadish",50000f,20);
		Employee e2=new Employee("Omkar",40000,20);
		e1.display();
		e2.display();
	}
}
