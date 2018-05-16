/**
 * 
 */
package com.verizon.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.verizon.service.EmpService;

/**
 * @author verizon
 *
 */
public class SpringApp2 {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("context.xml");
		EmpService empService= ctx.getBean(EmpService.class);
		String result= empService.registerEmp(123, "Ramcharan", "NLR", 1230148);
		System.out.println(result);
	}
}
