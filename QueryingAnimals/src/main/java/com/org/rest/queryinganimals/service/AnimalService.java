package com.org.rest.queryinganimals.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Ramesh
 *
 */
public interface AnimalService {

	public List<com.org.rest.queryinganimals.model.Animal> getAnimalList();
}
