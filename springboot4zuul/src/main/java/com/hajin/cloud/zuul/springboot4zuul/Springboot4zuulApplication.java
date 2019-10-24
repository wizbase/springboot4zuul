package com.hajin.cloud.zuul.springboot4zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Springboot4zuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4zuulApplication.class, args);
	}

}
