/**
 * 
 */
package com.verizon.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.verizon.bean.Employee;
import com.verizon.dao.EmpDao;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages ={"com.verizon.dao.impl","com.verizon.service","com.verizon.advice"})
@EnableAspectJAutoProxy
public class AppConfig {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);	
		EmpDao empDao=ctx.getBean(EmpDao.class);
		//empDao.saveEmp(new Employee(188,"Sri","MAS",123654));
		empDao.getAllEmps();
	}
	
	@Bean
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
								ds.setDriverClassName("com.mysql.jdbc.Driver");
								ds.setUrl("jdbc:mysql://localhost:3306/springdb");
								ds.setUsername("root");
								ds.setPassword("password");
		return ds;								
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jt = new JdbcTemplate();
					 jt.setDataSource(dataSource());
		return jt;
	}
}
