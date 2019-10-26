package com.org.rest.queryinganimals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.rest.queryinganimals.model.Animal;
import com.org.rest.queryinganimals.service.AnimalService;
/**
 * 
 * @author Ramesh
 *
 */
@RestController
@Component
@RequestMapping(value = "/animals")
public class QueryingAnimalController {

	//Comment the code since i have not used DB
	/*@Autowired
	AnimalRepository animalRepository;*/
	
	@Autowired
	AnimalService animalService;

	@GetMapping(value = "/getAnimalList", produces = "application/json")
	public ResponseEntity<List<Animal>> getAnimalList() {
		// Commented the below line it will connect from DB and fetch the details
		// meanwhile i will hard code the animals.
		// List<Animal> animalList = animalRepository.findAll();
		List<Animal> animalList = animalService.getAnimalList();
		
		if (animalList.isEmpty()) {
			return new ResponseEntity<List<Animal>>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Animal>>(animalList, HttpStatus.OK);
		}

	}

}
