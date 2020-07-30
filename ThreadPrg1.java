package Package1;

class NewClass extends Thread{
	
	public void run() {
		System.out.println("Entry point for new thread");
	}
}

public class ThreadPrg1  {

	
	public static void main(String[] args) {

		NewClass obj = new NewClass();
		obj.start();

	}

}
