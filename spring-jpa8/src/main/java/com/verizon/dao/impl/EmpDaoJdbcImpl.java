/**
 * 
 */
package com.verizon.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
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

	@PersistenceContext
	EntityManager em;
	

	@Override
	public int saveEmp(Employee e) {
		 em.persist(e);
		return 1;
	}
	
	@Override
	public Employee findById(int empId){
		Employee e = em.find(Employee.class, empId);
		return e;
	}
	@Override
	public String deleteEmp(int empId){
		String result;
		Employee e = em.find(Employee.class, empId);
		if(e!=null){
			em.remove(e);
			result="success";
		}
		else{
			result="not found";
		}
		return result;
	}
	@Override
	public List<Employee> getall(){
		Query q = em.createQuery("select e from Employee e");
		List<Employee> emps = q.getResultList();
		return emps;
	}

}
