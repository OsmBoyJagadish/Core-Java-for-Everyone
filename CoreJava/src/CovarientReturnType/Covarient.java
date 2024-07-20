package CovarientReturnType;

class Pizza{
	Pizza getPizza(){
		System.out.println("pizza");
		return null;    //void ke alava kuch bhi ho to return karna hoga
	}
}
class Dominos extends Pizza{
	//overriding
	Dominos getPizza(){   //returnType me parent aur child dono class ke naam likh sakte hai
		System.out.println("Dominos pizza");
		return null;
	}
}
public class Covarient {

	public static void main(String[] args) {
		System.out.println("hello");
		Dominos d = new Dominos();
		d.getPizza();
	}
}
