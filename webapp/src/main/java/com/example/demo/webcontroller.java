package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webcontroller {

	@RequestMapping("/welcome")
	public String welcome() {
		
		System.out.println("welcome");
		return "welcome";
	}
	
	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public ModelAndView getname(@PathVariable("name")String name) {
		
		ModelAndView mv = new ModelAndView("path");
		mv.addObject("info",name );
		
			return mv;
		
	}
}
