package com.myapp.springconfigserver.myconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigServerApplication.class, args);
	}

}
