package com.culysoft.citiesapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.culysoft.citiesapi.model.entity.State;
import com.culysoft.citiesapi.model.repository.StateRepository;

@RestController
@RequestMapping("/staties")
public class StateController {
	
	@Autowired
	private StateRepository repository;

	@GetMapping
	public List<State> staties() {
		return repository.findAll();
	}
}
