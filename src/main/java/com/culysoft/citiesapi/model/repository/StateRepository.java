package com.culysoft.citiesapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culysoft.citiesapi.model.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
