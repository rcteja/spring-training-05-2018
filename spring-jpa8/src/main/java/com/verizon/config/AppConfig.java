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
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.verizon.bean.Employee;
import com.verizon.service.EmpService;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages ={"com.verizon.dao.impl","com.verizon.service"})
@EnableTransactionManagement
public class AppConfig {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);	
		EmpService empService=ctx.getBean(EmpService.class);

		List<Employee> list = new ArrayList<>();
		list.add( new Employee(587, "A","HYD", 10000));
		list.add( new Employee(255, "A","HYD", 10000));
		empService.registerEmp(list);
		//empService.getAll();
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
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan("com.verizon.bean");
		HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
		va.setShowSql(true);
		va.setDatabase(Database.MYSQL);
		emf.setJpaVendorAdapter(va);
		return emf;
	}
	@Bean
	public JpaTransactionManager jpaTransactionManager(){
		JpaTransactionManager tx = new JpaTransactionManager();
		tx.setEntityManagerFactory(entityManagerFactory().getObject());
		return tx;
		
	}
	
}
