/**
 * 
 */
package com.verizon.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.verizon.bean.Employee;

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
		JdbcTemplate jt =(JdbcTemplate) ctx.getBean("jdbcTemplate");
		
		//update the data into table
		jt.update(new PreparedStatementCreator(){
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pst = conn.prepareStatement("insert into emp values(?,?,?,?)");
				pst.setInt(1, 999);
				pst.setString(2, "Krisna");
				pst.setString(3, "NLR");
				pst.setDouble(4, 12345568);
				return pst;
			}
			
		});
		
		
		// Getting the list of the data in to arraylist
		List<Employee> listEmp=jt.query("select * from emp", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int count) throws SQLException {
				
				return new Employee(rs.getInt("empno"),rs.getString("name"), rs.getString("address"),rs.getDouble("salary"));
			}
			
		});
		
		//update the the row
		int update = jt.update("update emp set name='Sai' where name='Krishna' ");
		
		
		//using lamda
		List<Employee> listEmpLamda=jt.query("select * from emp", (ResultSet rs, int count)->{

				
				return new Employee(rs.getInt("empno"),rs.getString("name"), rs.getString("address"),rs.getDouble("salary"));
			
		});
		
		//accessing on obj
		Employee e = (Employee) jt.queryForObject("select * from emp where empno="+104,(rs, count)->{ return  new Employee(rs.getInt("empno"),rs.getString("name"), rs.getString("address"),rs.getDouble("salary"));
		});
		System.out.println(e);
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
