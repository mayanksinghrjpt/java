package com.first.core;

import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");

		vehicle obj = (vehicle) ap.getBean("car");
		obj.drive();

		System.out.println("-----------------------");

		vehicle obj1 = (vehicle) ap.getBean("bike");
		obj1.drive();
	}
}
