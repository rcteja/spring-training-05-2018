/**
 * 
 */
package com.verizon.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author verizon
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Bean
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
								ds.setDriverClassName("com.mysql.jdbc.Driver");
								ds.setUrl("jdbc:mysql://localhost:3306/springdb");
								ds.setUsername("root");
								ds.setPassword("password");
		return ds;								
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/**").hasRole("USER").and().httpBasic();
	}
	
	
	//in-memory authentication
	
/*	@Autowired	
	public void configureGlobal(AuthenticationManagerBuilder amb) throws Exception{
		
		amb.inMemoryAuthentication().withUser("ramcharan").password("ramcharan").roles("USER");	
		amb.inMemoryAuthentication().withUser("krish").password("123").roles("ADMIN");
		amb.inMemoryAuthentication().withUser("ravi").password("1235").roles("USER").disabled(true);
		
	}*/
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder amb) throws Exception {
		amb.jdbcAuthentication().dataSource(dataSource())
		.usersByUsernameQuery("select username,password,enabled from users where username =?")
		.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
	}
	
}
