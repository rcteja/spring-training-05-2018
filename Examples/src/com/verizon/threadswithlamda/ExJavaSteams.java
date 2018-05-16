/**
 * 
 */
package com.verizon.threadswithlamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.verizon.collections.Employee;

/**
 * @author verizon
 *
 */
public class ExJavaSteams {


	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("charan");
		al.add("teja");// add by value(object)
		al.add(0, "Konda");
		
		Map<Integer, Employee> map = new HashMap<>();
		map.put(100, new Employee(100, "A","HYD", 10000));
		map.put(101, new Employee(101, "B","CHE", 200010));
		map.put(102, new Employee(102, "C","NLR", 5010));
		map.put(103, new Employee(103, "D","SEC", 5464510));
		map.put(104, new Employee(104, "E","BLR", 10565));
		map.put(105, new Employee(105, "F","BOM", 65610));
		
		al.stream().filter((obj)->obj.equals("Ram"));
		
	}

}
