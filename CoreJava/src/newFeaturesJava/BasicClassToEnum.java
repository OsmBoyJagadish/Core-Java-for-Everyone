package newFeaturesJava;

public class BasicClassToEnum {
	
		private BasicClassToEnum(){
			System.out.println("get called");
		}
		public static final BasicClassToEnum b=new BasicClassToEnum();
		public static final BasicClassToEnum b1=new BasicClassToEnum();
		
}
