package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BookApplication {

	@Value("${user.name}")
	static String name;
	@Value("${user.password}")
	static String password;

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
		System.out.println(name);
		System.out.println(password);
	}
}
