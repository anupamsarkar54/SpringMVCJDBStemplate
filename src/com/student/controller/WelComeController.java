package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.dao.StudentDAO;

import com.student.model.Student;


@Controller
public class WelComeController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping(value="/*",method = RequestMethod.GET)
	public ModelAndView hellowStudent(){
	
		String message = "Hellow Student!!!!";
		return new ModelAndView("welcome","message",message);
		
	}
	
	@RequestMapping(value="/getStudent",method = RequestMethod.GET)
	public ModelAndView getStudent(){
	
		Student student = dao.getStudent(1);
		String message = "Hellow !!!!" + student.getName();
		return new ModelAndView("welcome","message",message);
		
	}

}
