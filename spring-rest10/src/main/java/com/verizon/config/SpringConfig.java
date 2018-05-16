/**
 * 
 */
package com.verizon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author verizon
 *
 */
@Configuration
@ComponentScan(basePackages={"com.verizon.controller","com.verizon.config"})
@EnableWebMvc
public class SpringConfig {
	

}
