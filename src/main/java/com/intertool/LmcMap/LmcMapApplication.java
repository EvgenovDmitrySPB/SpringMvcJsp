package com.intertool.LmcMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
		"controller",
		"configuration"})
public class LmcMapApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LmcMapApplication.class, args);
	}

}