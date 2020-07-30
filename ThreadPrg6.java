package Package1;

class Test extends Thread{
int res =0;
	
	public void run() {
		String str = Thread.currentThread().getName();
		System.out.println("Thread started "+str);
		
		synchronized (this) {
			
			for(int i = 0; i<10;i++) {
				res = res+ i;	
			}
			notify();
			
		}
		
	}
	
}

public class ThreadPrg6  {
	
	public static void main(String[] args) {
		Test twobj = new Test();
		twobj.start();
		synchronized (twobj) {
			try {
				twobj.notify();
				twobj.notifyAll();
				twobj.wait();
				System.out.println("running ");
				
			} catch(Exception e){
				e.getMessage();
			}
			System.out.println(twobj.res);
		}
	}

}
