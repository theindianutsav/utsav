/*package com.utsav.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

*//**
 * Hello world!
 *
 *//*

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.utsav")
public class App extends SpringBootServletInitializer {
	public static void main(String[] args) {
		//new SpringApplication().configure(new SpringApplicationBuilder(App.class, args)).run(args);
	
		SpringApplication.run(App.class, args);
	}
	
	   @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(App.class);
	    }

	    public static void main(String[] args) {
	        new App().configure(new SpringApplicationBuilder(App.class, args)).run(args);
	    }
}
*/