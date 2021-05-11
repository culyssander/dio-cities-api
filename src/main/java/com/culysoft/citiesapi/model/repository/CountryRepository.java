package com.culysoft.citiesapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.culysoft.citiesapi.model.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
