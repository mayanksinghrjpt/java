package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Daoimplementation;
import com.example.demo.model.Emply;

@RestController
public class CantrollerClass {

	@Autowired
	Daoimplementation dao;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index.jsp");
	    return mv;
	}
	
	@RequestMapping("/addemply")
	public ModelAndView addemply(Emply emply) {
		
		ModelAndView mv = new ModelAndView("save.jsp");
		mv.addObject("emp", emply);
		dao.save(emply);
		
		return mv;
	}
	
	
	@GetMapping("/emply/{id}")
	public Optional<Emply> getemply(@PathVariable("id") int id) {
		
		return dao.findById(id);
	}
	
	
	@GetMapping("/emply")
	public List<Emply>  getemplys() {
		
		return dao.findAll();
	}
	

	@PostMapping("/addemp")
	public Emply postdata(@RequestBody Emply emp) {
		 
		dao.save(emp);
		return emp;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		
		Emply e = dao.getOne(id);
		dao.delete(e);
		return "deleted";
	}
	
	@PutMapping("/update")
	public Emply updatetdata(@RequestBody Emply emp) {
		 
		dao.save(emp);
		return emp;
		
	}
	
}
