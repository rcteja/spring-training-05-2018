/**
 * 
 */
package com.verizon.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author verizon
 *
 */
public class ExSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Ram");
		set.add("charan");
		set.add("teja");// add by value(object)
		//set.add(0, "Konda");//add by index not supported in set
		set.remove("Ram");//remove by object
		set.remove(1);// remove by index not supported

		System.out.println(set);//will call the toString impl of List object
		
		//Iterating the al
		//Iterator
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//enhanced for loop
		for(String name : set){
			System.out.println(name);
		}
	}

}
