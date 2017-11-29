package tech.metamaker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectWithSpringApplication.class, args);
		System.out.println("Mudei de novo");
	}
}
