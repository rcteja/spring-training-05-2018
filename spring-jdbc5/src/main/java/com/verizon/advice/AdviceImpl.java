/**
 * 
 */
package com.verizon.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author verizon
 *
 */
@Component
@Aspect
public class AdviceImpl {

	@Before("execution( * com.verizon.service.EmpService.registerEmp(..))")
	public void logBefore(){
		System.out.println("logging before method call");
	}
	@After("execution( * com.verizon.service.EmpService.registerEmp(..))")
	public void logAfter(){
		System.out.println("logging after method call");
	}
}
