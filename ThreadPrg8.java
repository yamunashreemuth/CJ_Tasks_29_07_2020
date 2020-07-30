package Package1;

public class ThreadPrg8 extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread used "+ Thread.currentThread().getName());
		}else {
			System.out.println("User thread used "+ Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
	
		ThreadPrg8 tnew = new ThreadPrg8();
		ThreadPrg8 tnew1 = new ThreadPrg8();
		ThreadPrg8 tnew2 = new ThreadPrg8();
		tnew.setDaemon(true);
		tnew.start();
		tnew1.start();
		tnew2.start();
		
	}

}
