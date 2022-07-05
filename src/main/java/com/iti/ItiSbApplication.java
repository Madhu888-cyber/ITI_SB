package com.iti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iti")
public class ItiSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItiSbApplication.class, args);
	}

}
