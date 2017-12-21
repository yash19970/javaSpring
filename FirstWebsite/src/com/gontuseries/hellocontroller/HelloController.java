package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController{
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage","hello world");
		
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage","hi world");
		
		return model;
	}
}