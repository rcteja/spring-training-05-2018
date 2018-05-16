package com.verizon.threadswithlamda;

public class Worker implements Runnable {

	@Override
	public void run() {

		try{
			for (int i=1;i<=10;i++){
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);	
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
