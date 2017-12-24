package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.collections.MappingChange.Map;

@Controller
@RequestMapping("/greeting")
public class HelloController{
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage","hello world");
		return model;
	}
	
	@RequestMapping("/PathVar/{countryName}/{userName}")
	public ModelAndView hiWorld(@PathVariable("countryName") String country, @PathVariable("userName") String name ){
		//String name = pathVars.get("userName");
		//String countryName = pathVars.get("countryName");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage"," hi " + name +  "You're from "+name);
		return model;
	}
}