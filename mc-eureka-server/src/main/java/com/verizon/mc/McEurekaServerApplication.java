package com.verizon.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McEurekaServerApplication.class, args);
	}
}


