package Package1;

public class ThreadPrg5 extends Thread {
	public void run() {
		//System.out.println(Thread.State.valueOf(getName()));
		System.out.println("Priority of thread: "+  Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
		ThreadPrg5 tobj = new ThreadPrg5();
		ThreadPrg5 tobj1 = new ThreadPrg5();
		ThreadPrg5 tobj2 = new ThreadPrg5();
		ThreadPrg5 tobj3 = new ThreadPrg5();
		tobj.setPriority(MAX_PRIORITY);
		tobj1.setPriority(MIN_PRIORITY);
		tobj2.setPriority(NORM_PRIORITY);
		tobj3.setPriority(2);
		tobj.start();
		tobj1.start();
		tobj2.start();
		tobj3.start();
		System.out.println("Max priority " +tobj);
		System.out.println("Min priority " +tobj1);
		System.out.println("Normal priority " +tobj2);
		System.out.println("User priority " +tobj3);
	}

}
