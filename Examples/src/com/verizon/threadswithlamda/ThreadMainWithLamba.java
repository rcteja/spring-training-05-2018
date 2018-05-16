/**
 * 
 */
package com.verizon.threadswithlamda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author verizon
 *
 */
public class ThreadMainWithLamba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		}).start();
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//numbers.forEach(n -> System.out.print(n));
		
		numbers.forEach(n ->{
			if (n%2 ==0) System.out.print(n);
			});
	}
	//parrelStream, will create thread for faster
}
