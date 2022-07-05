package com.iti.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.DBC.MyUtil;
import com.iti.entity.Open_Application_form;
import com.iti.repo.Open_Application_repo;
import com.iti.service.Open_Application_service;
@Service
public class Open_Application_service_impl implements Open_Application_service{
	
	@Autowired private Open_Application_repo repo;
	@Autowired private MyUtil util;

	@Override
	public Open_Application_form saveStudent(Open_Application_form student) {
		Date dob = Date.valueOf(util.ChDate1(student.getDob()));
		return repo.save(student);
	}

	@Override
	public Open_Application_form updateStudent(Open_Application_form student) {
		return repo.save(student);
	}

	@Override
	public Optional<Open_Application_form> getStudent(Long ssc_regno) {
		return repo.findById(ssc_regno);
	}

	@Override
	public List<Open_Application_form> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public void deleteStudent(Long ssc_regno) {
		repo.deleteById(ssc_regno);
	}

	@Override
	public void deleteAllStudent() {
		repo.deleteAll();
	}

}
