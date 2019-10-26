package com.org.rest.queryinganimals.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.rest.queryinganimals.model.Bird;
import com.org.rest.queryinganimals.model.Dog;
import com.org.rest.queryinganimals.service.AnimalService;
/**
 * 
 * @author Ramesh
 *
 */
@Service
public class AnimalImpl implements AnimalService{
	
	@Override
	public List<com.org.rest.queryinganimals.model.Animal> getAnimalList() {
		// TODO Auto-generated method stub
		
		List<com.org.rest.queryinganimals.model.Animal> animalList=new ArrayList<>();
		animalList.add(new com.org.rest.queryinganimals.model.Animal(new Bird("American Parrot"), new Dog("Pitbull")));
		return animalList;
	}

}
