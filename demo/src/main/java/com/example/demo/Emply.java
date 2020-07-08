package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Emply {

	String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void show() {
		System.out.println(" Person company name");

	}
}
