package com.example.DBMessageTesting.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.DBMessageTesting.persistance.Person1;
import com.example.DBMessageTesting.persistance.PersonRepository;

@Service
public class PersonService {

	PersonRepository repository;

	public PersonService(PersonRepository repository) {
		this.repository = repository;
	}
	
	public List<Person1> getAll(){	
		return this.repository.findAll();
	}
	public Person1 getById(@PathVariable Long id) {
		return this.repository.findById(id).get();
	}
	
	
}
