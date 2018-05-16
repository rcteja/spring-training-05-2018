/**
 * 
 */
package com.verizon.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.verizon.bean.Mail;

/**
 * @author verizon
 *
 */
public class SpringApp1 {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Mail  mail =(Mail) ctx.getBean("mail");
		
		System.out.println(mail.toString());

	}

}
