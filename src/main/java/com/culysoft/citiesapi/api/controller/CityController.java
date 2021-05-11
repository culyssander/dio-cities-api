package com.culysoft.citiesapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.culysoft.citiesapi.model.entity.City;
import com.culysoft.citiesapi.model.repository.CityRepository;

@RestController
@RequestMapping("cities")
public class CityController {

	@Autowired
	private CityRepository repository;

//	  @GetMapping
	public List<City> cities() {
		return repository.findAll();
	}

	@GetMapping
	public Page<City> cities(final Pageable page) {
		return repository.findAll(page);
	}
}
