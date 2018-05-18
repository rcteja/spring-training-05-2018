package com.verizon.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.demo.spring"})
public class McEurekaClient1Application {

	
	public static void main(String[] args) {
		SpringApplication.run(McEurekaClient1Application.class, args);
	}
}
