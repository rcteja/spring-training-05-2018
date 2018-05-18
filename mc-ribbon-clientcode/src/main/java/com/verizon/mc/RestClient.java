/**
 * 
 */
package com.verizon.mc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author verizon
 *
 */
@RestController
public class RestClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(path="/send", method=RequestMethod.GET, produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> send(@RequestParam("id") int empId,@RequestParam("name") String empName,@RequestParam("city") String	 city,
			@RequestParam("salary") double salary){
		System.out.println("");
		Employee e  = new Employee(empId,empName,city,salary);
		System.out.println(e.toString());
		HttpHeaders hd = new HttpHeaders();
		hd.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Employee> he = new HttpEntity<>(e);
		ResponseEntity<String> response = restTemplate.exchange("http://MC-SERVICE/employ", HttpMethod.POST, he, String.class);
		return response;	
	}

}
