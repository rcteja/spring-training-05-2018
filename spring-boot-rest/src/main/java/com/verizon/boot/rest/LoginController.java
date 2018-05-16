/**
 * 
 */
package com.verizon.boot.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author verizon
 *
 */
@RestController
@RequestMapping(path="/emp")
public class LoginController {
	
	static Map<Integer,Employee> map = new HashMap<>();
	static{	
		map.put(705, new Employee(705, "A","HYD", 10000));
		map.put(101, new Employee(101, "B","CHE", 200010));
		map.put(102, new Employee(102, "C","NLR", 5010));
		map.put(103, new Employee(103, "D","SEC", 5464510));
		map.put(104, new Employee(104, "E","BLR", 10565));
		map.put(105, new Employee(105, "F","BOM", 65610));//adding 
		
	}

	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String info(){
		return "this is boot rest";
	}
	
	@RequestMapping(path="/employ/{id}" , method= RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> getById(@PathVariable("id")int empId){
		
		if(map.containsKey(empId)){
			System.out.println(empId);
			Employee e = map.get(empId);
			return ResponseEntity.ok(e);
		}else{
			return ResponseEntity.ok("Not found");
		}
		
	}
}

