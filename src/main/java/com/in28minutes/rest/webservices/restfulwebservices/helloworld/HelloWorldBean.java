package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	public HelloWorldBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
