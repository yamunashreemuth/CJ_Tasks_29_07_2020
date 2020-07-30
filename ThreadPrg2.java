package Package1;

public class ThreadPrg2 implements Runnable{
	public void run() {
		System.out.println("Current Thread ID is: "+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
	
		Thread rtobj = new Thread(new ThreadPrg2());
		rtobj.start();

	}

}
