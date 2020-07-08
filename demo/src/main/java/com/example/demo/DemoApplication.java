package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Person p = context.getBean(Person.class);

		p.setId(1);
		p.setName("mayank");
		System.out.println("Person Id -" + p.getId() + " ," + "Person name -" + p.getName());
		p.view();

	}

}
