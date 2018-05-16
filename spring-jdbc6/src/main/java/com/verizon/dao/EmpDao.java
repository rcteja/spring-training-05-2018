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

	public int saveEmp(Employee e);
	
	public List<Employee> getAllEmps();
	
	public int updateEmp(Employee e);

	public int deleteEmp(int id);
	
	public Employee findById(int id);
}
