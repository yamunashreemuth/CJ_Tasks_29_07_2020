package Package1;

public class ThreadPrg3 extends Thread implements ITest {
	public void run() {
		for(int i =0; i<10; i++ ) {
			System.out.println("run thread "+(Thread.currentThread().getPriority()));
	}
	}

	public static void main(String[] args) {

		
		ThreadPrg3 cobj = new ThreadPrg3();
		Thread tobj = new Thread(cobj);
		tobj.start();
		
	}

}
