package com.breden.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan   
@SpringBootApplication(scanBasePackages={"com.breden.springboot"}, exclude = { SecurityAutoConfiguration.class })// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class ServletInitializer extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
	     SpringApplication.run(ServletInitializer.class, args);
	}
	 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }
 
}
