/**
 * 
 */
package com.verizon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages={"com.verizon.controller","com.verizon.config"})
@EnableWebMvc
public class SpringConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vr = new InternalResourceViewResolver();	
		vr.setPrefix("/WEB-INF/pages/");
		vr.setSuffix(".jsp");
		vr.setOrder(0);
		return vr;
	}
	@Bean
	public ResourceBundleViewResolver resourceViewResolver(){
		ResourceBundleViewResolver rvr = new ResourceBundleViewResolver();
		rvr.setBasename("views");
		rvr.setOrder(1);
		return rvr;
	}

}
