package com.jenkins.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 打包方式为war需要继承SpringBootServletInitializer
 */
@SpringBootApplication
public class Application{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}