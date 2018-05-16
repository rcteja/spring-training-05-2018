/**
 * 
 */
package com.verizon.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author verizon
 *
 */
public class ExList {

	
	public static void main(String[] args) {

			List<String> al = new ArrayList<String>();
			al.add("Ram");
			al.add("charan");
			al.add("teja");// add by value(object)
			al.add(0, "Konda");//add by index
			al.remove("Ram");//remove by object
			al.remove(1);// remove by index

			System.out.println(al);//will call the toString impl of List object
			
			//Iterating the al
			//Iterator
			Iterator<String> itr = al.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			//enhanced for loop
			for(String name : al){
				System.out.println(name);
			}
			
	}

}
