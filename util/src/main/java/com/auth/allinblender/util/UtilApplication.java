package com.auth.allinblender.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class } )
public class UtilApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilApplication.class, args);
	}

}
