package com.org.rest.queryinganimals.model;

/**
 * 
 * @author Ramesh
 *
 */
public class Dog {

	private String dogType;

	public Dog(String dogType) {
		this.dogType = dogType;
	}

	public String getDogType() {
		return dogType;
	}

	public void setDogType(String dogType) {
		this.dogType = dogType;
	}

}
