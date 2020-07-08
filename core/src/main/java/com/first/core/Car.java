package com.first.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {

	@Autowired
	public Tyre tyre;

	@Override
	public void drive() {
		tyre.setBrand("MRF tyre");
		System.out.println("It's a car");
		System.out.println(tyre.getBrand());

	}

}
