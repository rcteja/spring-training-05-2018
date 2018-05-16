/**
 * 
 */
package com.verizon.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author verizon
 *
 */
@RestController
public class MyRestController {

	/**
		 * @author verizon
		 *
		 */
	public class Employee {
		
		private String userName;
		private String password;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Employee [userName=" + userName + ", password=" + password + "]";
		}
		
		

	}

	@RequestMapping( path ="/greet" , method= RequestMethod.GET)
	public String getLoginPage(){
		return "Hello";
	}
	
	@RequestMapping( path ="/greet" , method= RequestMethod.POST)
	
	public String userLogin(@RequestBody Employee e){
		System.out.println(e.toString());
		return "Success";
	}
}

