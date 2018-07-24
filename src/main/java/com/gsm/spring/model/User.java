package com.gsm.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
