
public class MyRunnable implements Runnable {
	
	@Override
	public void run() {	
		System.out.println("in run()- " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		Thread t1 = new Thread(()->System.out.println("in run()- "));
		t1.start();
	}
}
