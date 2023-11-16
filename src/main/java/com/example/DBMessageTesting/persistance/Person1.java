package com.example.DBMessageTesting.persistance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person1 {

	@Id
	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
