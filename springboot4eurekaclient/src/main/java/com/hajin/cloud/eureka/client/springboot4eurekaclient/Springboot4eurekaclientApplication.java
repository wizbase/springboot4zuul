package com.hajin.cloud.eureka.client.springboot4eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springboot4eurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4eurekaclientApplication.class, args);
	}

}
