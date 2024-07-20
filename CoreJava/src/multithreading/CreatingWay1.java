package multithreading;

public class CreatingWay1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread in Way 1");
	}
	public static void main(String[] args) {
		CreatingWay1 c=new CreatingWay1();
		Thread t=new Thread(c);
		t.start();

	}
}
