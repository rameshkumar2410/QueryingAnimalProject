package com.org.rest.queryinganimals.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Ramesh
 *
 */

public class Animal {
	private Bird bird;
	private Dog dog;
	public Animal(Bird bird, Dog dog) {
		this.bird = bird;
		this.dog = dog;
	}

	public Animal() {
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
