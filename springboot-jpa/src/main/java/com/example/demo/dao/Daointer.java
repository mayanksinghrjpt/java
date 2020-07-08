package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Person;

public interface Daointer extends CrudRepository<Person, Integer> {

	//@Query("from person where pname=?1")
	List<Person> findBypname(String name);
}
