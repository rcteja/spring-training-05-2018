/**
 * 
 */
package com.verizon.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.verizon.bean.Employee;
import com.verizon.service.EmpService;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages ={"com.verizon.dao.impl","com.verizon.service","com.verizon.advice"})
@EnableTransactionManagement
public class AppConfig {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);	
		EmpService empService=ctx.getBean(EmpService.class);

		List<Employee> list = new ArrayList<>();
		list.add( new Employee(705, "A","HYD", 10000));
		list.add( new Employee(101, "B","CHE", 200010));
		list.add( new Employee(102, "C","NLR", 5010));
		list.add( new Employee(103, "D","SEC", 5464510));
		list.add( new Employee(104, "E","BLR", 10565));
		list.add( new Employee(105, "F","BOM", 65610));//adding 
		empService.registerEmp(list);
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
	@Bean
	public DataSourceTransactionManager trasactionManager(){
		
		DataSourceTransactionManager dt = new DataSourceTransactionManager();
		dt.setDataSource(dataSource());
		return dt;
	}
}
