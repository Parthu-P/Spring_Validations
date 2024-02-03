package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StafEntity;
import com.example.demo.service.StafService;

import jakarta.validation.Valid;

@RestController
public class StafController {

	@Autowired
	private StafService service;
	
	@PostMapping("/create")
	public StafEntity create( @Valid @RequestBody StafEntity staf) {
		service.create(staf);
		return staf;
		
	}
}
