package com.verizon.threadswithlamda;

public class ThreadMain {
	
	public static void main(String args[]) throws InterruptedException{
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		Thread t3 = new Thread(new Worker());
		System.out.println(Thread.currentThread().getName());

		t1.start();
		t2.start();
		t3.start();

		t3.join();
		System.out.println(Thread.currentThread().getName());

	}
}
