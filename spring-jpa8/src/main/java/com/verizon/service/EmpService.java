/**
 * 
 */
package com.verizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
@Service 
public class EmpService {
	
	@Autowired
	@Qualifier("empDaoJdbcImpl")
	private EmpDao empDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public int registerEmp(List<Employee> empList){
		
		try{
			for(Employee e : empList){
				int result = empDao.saveEmp(e);
				if(result==1){
					System.out.println("success");
				}else{
					System.out.println("rollback");
				}
			}	
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 1;
		}

	public void getAll() {
		List<Employee> list =empDao.getall();
		System.out.println(list);
	}
		
		
}
