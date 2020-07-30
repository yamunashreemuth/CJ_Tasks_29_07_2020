package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A extends Thread{ //both classes have own thread and doesn't share 
	
	private final List<Integer> ilst = Arrays.asList(1,6,8,3,4,9);
	public void run() {
		ilst.forEach(System.out::println);
	}
}

class B extends Thread{
	private final List<String> slst = Arrays.asList("i","a","e","o","u");
	public void run() {
		slst.forEach(System.out::println);
	}
}
public class ThreadPrg7 {

	public static void main(String[] args) {
		Thread obj = new Thread(new A());
		A nobj = new A();
		B bobj = new B();
		obj.start();
		bobj.start();

	}

}
