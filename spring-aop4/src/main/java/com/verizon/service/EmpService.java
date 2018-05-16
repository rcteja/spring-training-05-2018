/**
 * 
 */
package com.verizon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
@Service 
public class EmpService {
	
	@Autowired
	@Qualifier("empDaoJPAImpl")
	private EmpDao empDao;
	
	public String registerEmp(int id, String name, String city, double salary){
		
		String result = empDao.SaveEmp(new Employee(id, name, city,salary));
		
		System.out.println(result);
		
		if("saved".equalsIgnoreCase(result)){
			return "successful register";
		}else{
			return "not successful, Try again";
		}
	}
}
