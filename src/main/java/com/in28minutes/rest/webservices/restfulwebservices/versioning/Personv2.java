package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Personv2 {
	
	private Name name;

	public Personv2(Name name) {
		super();
		this.name = name;
	}

	public Personv2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Personv2 [name=" + name + "]";
	}

}
