package com.iti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.iti.entity.Ssc_boards;
import com.iti.repo.Ssc_boards_repo;
import com.iti.service.Ssc_boards_service;
@Service
public class Ssc_boards_service_impl implements Ssc_boards_service{
	
	@Autowired private Ssc_boards_repo repo;

	@Override
	public List<Ssc_boards> getAllBoards() {
		return repo.findAll();
	}
}
