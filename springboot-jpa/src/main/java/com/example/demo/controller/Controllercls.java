package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Daointer;
import com.example.demo.model.Person;

@Controller
public class Controllercls {

	@Autowired
	Daointer dao;
	
	@RequestMapping("/")
	public String home() {

		return "home.jsp";
	}
	
	@RequestMapping("/addperson")
	public ModelAndView addpersone(Person person) {
		
		ModelAndView mv = new ModelAndView("done.jsp");
		dao.save(person);
		mv.addObject("per", person);
		
		System.out.println(dao.findBypname("mayank")); //adding new method in crud repository 
		
		return mv;
		
	}
	
	@RequestMapping("/getperson")
	public ModelAndView getperson(@RequestParam int pid) {
		
		ModelAndView mv = new ModelAndView("get.jsp");
		Person  p = dao.findById(pid).orElse(new Person());
		mv.addObject(p);
		return mv ;
		
	}
}




