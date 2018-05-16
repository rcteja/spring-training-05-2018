/**
 * 
 */
package com.verizon.dao;

import java.util.List;

import com.verizon.bean.Employee;

/**
 * @author verizon
 *
 */
public interface EmpDao {

	int saveEmp(Employee e);

	Employee findById(int empId);

	String deleteEmp(int empId);

	List<Employee> getall();
	
}
