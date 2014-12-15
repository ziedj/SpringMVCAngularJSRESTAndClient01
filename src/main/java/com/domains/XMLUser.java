package com.domains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLUser {
	
	private String name;
	private String firstName;

	public XMLUser() {
		super();
	}

	public XMLUser(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
