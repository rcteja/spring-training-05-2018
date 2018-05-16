/**
 * 
 */
package com.verizon.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.verizon.service.EmpService;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages ={"com.verizon.dao.impl","com.verizon.service"})
public class AppConfig {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService empService =	(EmpService) ctx.getBean("empService");
		String result=empService.registerEmp(1234, "Teja", "NLR", 11355.52);
		System.out.println(result);
	}
}
