package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

	int id;
	String name;
	@Autowired
	public Emply emply;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("constructor");
	}

	public void view() {
		emply.setCompany("wipro");
		System.out.println("new person is read");
		emply.show();
		System.out.println("Person company -" + emply.getCompany());

	}
}
