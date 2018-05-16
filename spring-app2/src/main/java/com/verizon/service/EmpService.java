/**
 * 
 */
package com.verizon.service;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
public class EmpService {
	
	EmpDao empDao;
	
	public String registerEmp(int id, String name, String city, double salary){
		
		String result = empDao.SaveEmp(new Employee(id, name, city,salary));
		
		System.out.println(result);
		
		if("saved".equalsIgnoreCase(result)){
			return "successful register";
		}else{
			return "not successful, Try again";
		}
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	
}
