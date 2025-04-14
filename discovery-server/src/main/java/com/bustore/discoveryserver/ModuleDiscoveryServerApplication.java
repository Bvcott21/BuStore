package com.bustore.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModuleDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleDiscoveryServerApplication.class, args);
	}

}
