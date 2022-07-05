package com.iti.service;

import java.util.List;
import java.util.Optional;

import com.iti.entity.Open_Application_form;

public interface Open_Application_service {
	
	public Open_Application_form saveStudent(Open_Application_form student);
	public Open_Application_form updateStudent(Open_Application_form student);
	public Optional<Open_Application_form> getStudent(Long ssc_regno);
	public List<Open_Application_form> getAllStudents();
	public void deleteStudent(Long ssc_regno);
	public void deleteAllStudent();
	

}
