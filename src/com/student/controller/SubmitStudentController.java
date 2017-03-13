package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@Controller
public class SubmitStudentController {
	@Autowired
	StudentDAO dao;
	@RequestMapping(value="/enroll",method = RequestMethod.POST)
	public ModelAndView enrollStudent(@ModelAttribute("student")Student student, 
			BindingResult result){
		
		String result1 = "";
		System.out.println(student.getName());
		
		if(student.getName().equalsIgnoreCase("anupam")){
			result1 = dao.addStudent(student);
		}else{
			result1= "failure";
		}
		//return result1;
		
		return new ModelAndView(result1,"student",student);
	}

}
