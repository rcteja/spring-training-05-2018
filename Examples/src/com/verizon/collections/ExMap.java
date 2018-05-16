/**
 * 
 */
package com.verizon.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author verizon
 *
 */
 
public class ExMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(100, new Employee(100, "A","HYD", 10000));
		map.put(101, new Employee(101, "B","CHE", 200010));
		map.put(102, new Employee(102, "C","NLR", 5010));
		map.put(103, new Employee(103, "D","SEC", 5464510));
		map.put(104, new Employee(104, "E","BLR", 10565));
		map.put(105, new Employee(105, "F","BOM", 65610));//adding 

		System.out.println(map);// Uses the toString Declared above
		
		//Getting Keys in Map
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys){
			System.out.println(map.get(key));//getting value by using key in Maps(Auto Boxing to Employee Object)
		}
		
	}

}
