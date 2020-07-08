package com.first.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {

	@Autowired
	public Tyre tyre;

	@Override
	public void drive() {
		tyre.setBrand("Apollo tyre");
		System.out.println("It's a bike");
		System.out.println(tyre.getBrand());

	}

}
