package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;

@Controller
public class RegisterController {
	@RequestMapping(value="/registration",method = RequestMethod.GET)
	public String getRegister(Model model){
		model.addAttribute("student",new Student());
		//return new ModelAndView("registration",model);
		return "registration";
	}

}
