/**
 * 
 */
package com.verizon.dao.impl;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
public class EmpDaoJdbcImpl implements EmpDao {

	@Override
	public String SaveEmp(Employee e) {
		System.out.println("Employee Id"+e.getEmpId());
		return "saved";
	}

}
