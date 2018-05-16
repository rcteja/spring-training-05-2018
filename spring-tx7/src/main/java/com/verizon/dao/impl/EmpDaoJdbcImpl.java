/**
 * 
 */
package com.verizon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
@Repository
@Qualifier("empDaoJdbcImpl")
public class EmpDaoJdbcImpl implements EmpDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveEmp(Employee e) {
		int result=jdbcTemplate.update("insert into emp values (?,?,?,?)", (pst)-> {
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setString(3, e.getCity());
			pst.setDouble(4, e.getSalary());			
			});
		System.out.println(result);
		return result;
	}


}
