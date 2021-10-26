package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.services.InjectedByContsructorService;
import com.example.demo.services.SetterBasedService;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloSpringBootApplication.class, args);
		InjectedByContsructorService contsructorService = (InjectedByContsructorService) ctx
				.getBean("injectedByContsructorService");

		contsructorService.getMessage();

		SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");

		setterBasedService.getMessage();
	}

}
