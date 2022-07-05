package com.iti.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iti.entity.Open_Application_form;
import com.iti.entity.Ssc_boards;
import com.iti.model.Open_Application;
import com.iti.service.Open_Application_service;
import com.iti.service.Ssc_boards_service;

@Controller
public class StudentController {


	@Autowired private Ssc_boards_service service;
	@Autowired private Open_Application_service open_Application_service;
	
	 
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/open_application_entry")
	public String open(Model m) {
		m.addAttribute("open_application", new Open_Application());
		List<Ssc_boards> listboards = service.getAllBoards();
		m.addAttribute("listboards", listboards);
		
		return "open_application_entry";
	}
	@RequestMapping(value="/open_application-step1", method = RequestMethod.POST)
	public String reg(@Valid @ModelAttribute("open_application") Open_Application open_Application, BindingResult result, Model m) {
		List<Ssc_boards> listboards = service.getAllBoards();
		m.addAttribute("listboards", listboards);
		 
		if(result.hasErrors()) {
			 System.out.println(result);
			 return "open_application_entry";
		 }else {
			 System.out.println("values board_code"+open_Application.getSsc_board());
			 m.addAttribute("Open_Application_form", new Open_Application_form());
		return "open_Application_Interface_Student";
		 }
	}
	@RequestMapping(value="/open_applicationid_student")
	public String saveStudent(@ModelAttribute("Open_Application_form") Open_Application_form Open_Application_form) {
		open_Application_service.saveStudent(Open_Application_form);
		return "open_success";
	}
}
