/**
 * 
 */
package com.verizon.threadswithlamda;

/**
 * @author verizon
 *
 */
public class ThreadMainWithFunctionalProgram {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());

		new Thread(new Runnable(){

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
			
		}).start();
		
		new Thread(new Runnable(){

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
			
		}).start();
		
		new Thread(new Runnable(){

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
			
		}).start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
