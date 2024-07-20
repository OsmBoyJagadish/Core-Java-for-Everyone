package enumm;

public class Enum1 {
	
	public enum Week{
		Sunday,
		Monday,
		Tuesday
	}

	public static void main(String[] args) {
		
		for(Week w : Week.values()){
			System.out.println(w);
		}
		System.out.println(Week.valueOf("Monday").ordinal());
	}
}