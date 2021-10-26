package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/11/15.
 */
@Component
public class HelloWorld {
	public void sayHello() {
		System.out.println(HelloWorld.class + " - Hello World cambio desde STS!!");
	}

	public static void main(String[] args) {
		new HelloWorld().sayHello();
	}
}
