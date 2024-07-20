package multithreading;

public class CreatingWay2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread in Way 2");
	}
	
	public static void main(String[] args) {
		Thread t=new Thread(new CreatingWay2());
		t.start();
		System.out.println("Main");
	}

}
