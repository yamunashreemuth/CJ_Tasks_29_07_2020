package Package1;

import org.omg.PortableServer.Current;

public class ThreadPrg4 extends Thread{

	public static void main(String[] args) {
	
		ThreadPrg4 tpj = new ThreadPrg4();
		tpj.setName("Thread");
		tpj.start();
		
		ThreadGroup cgrp = Thread.currentThread().getThreadGroup();
		int num = cgrp.activeCount();
		Thread[] tlst = new Thread[num];
		cgrp.enumerate(tlst);
		for(int i=0; i<num; i++) {
			System.out.println("Thread " +i+" running "+tlst[i].getName());
		}
		Thread curreThread = Thread.currentThread();
		System.out.println("Current running thread: "+ curreThread);

	}

}
