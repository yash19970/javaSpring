package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class StudentAdmissionController {
	@RequestMapping(value="/admissionForm.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1,
																		BindingResult result){
		
		/*	Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		removing this, we use @ModelAttribute
		*/
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you: ");
		
		//model.addObject("student1", student1);
		return model;
	}
	
}
