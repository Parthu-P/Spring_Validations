package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StafEntity;
import com.example.demo.repo.StafRepo;

@Service
public class StafService {

	@Autowired
	private StafRepo repo;
	
	public String create(StafEntity entity) {
		repo.save(entity);
		return "success";
	}
}
