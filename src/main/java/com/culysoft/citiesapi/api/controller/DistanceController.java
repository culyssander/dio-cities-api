package com.culysoft.citiesapi.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.culysoft.citiesapi.model.service.DistanceService;
import com.culysoft.citiesapi.model.service.EarthRadius;

@RestController
@RequestMapping("/distances")
public class DistanceController {

	@Autowired
	private DistanceService distanceService;
	Logger log = LoggerFactory.getLogger(DistanceController.class);

	@GetMapping("/by-points")
	public Double byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return distanceService.distanceByPointsInMiles(city1, city2);
	}

	@GetMapping("/by-cube")
	public Double byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byCube");
		return distanceService.distanceByCubeInMeters(city1, city2);
	}

	@GetMapping("/by-math")
	public Double byMath(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2,
			@RequestParam final EarthRadius unit) {
		log.info("byMath");
		return distanceService.distanceUsingMath(city1, city2, unit);
	}
}
