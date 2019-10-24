package com.hs.api.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class RibbonclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonclientApplication.class, args);
	}

}
