package com.culysoft.citiesapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.culysoft.citiesapi.model.entity.Country;
import com.culysoft.citiesapi.model.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryRepository repository;
	
	@GetMapping
	public List<Country> findAll() {
		return repository.findAll();
	}

}
