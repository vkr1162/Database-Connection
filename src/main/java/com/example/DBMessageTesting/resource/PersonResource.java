package com.example.DBMessageTesting.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.DBMessageTesting.persistance.Person1;
import com.example.DBMessageTesting.service.PersonService;

@RestController
public class PersonResource {

	PersonService service;

	public PersonResource(PersonService service) {
		this.service = service;
	}
	@GetMapping(value = "/person")
	public List<Person1> getAll(){	
		return this.service.getAll();
		
	}
	@GetMapping(value = "/person/{id}")
	public Person1 getById(@PathVariable long id) {
		return this.service.getById(id);
	}
	
 
// @formatter:on

}
