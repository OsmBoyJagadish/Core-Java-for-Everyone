package multithreading;

public class MultiThreading1 {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{System.out.println("Thread Created");};
		Thread t=new Thread(r);
		t.start();
//		t.join();
		
		for(int i=0;i<=5;i++){
			System.out.println("Thread Sleep "+i+t.currentThread());
			try{
				t.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
