package com.hajin.cloud.eureka.springboot4eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springboot4eurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4eurekaApplication.class, args);
	}

}
