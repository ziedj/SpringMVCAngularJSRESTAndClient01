package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domains.Course;
import com.domains.User;
import com.domains.XMLJSONUser;
import com.domains.XMLUser;

@RestController
public class MyRestController {

	private List<User> users = new ArrayList<User>();

	public MyRestController() {
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	// User (Json)
	@RequestMapping(value = "newJsonUser")
	public User newUser() {
		return (new User("zied", "zied"));
	}

	// XMLUser (XML @)
	@RequestMapping(value = "newXMLUser", produces = "application/xml")
	public XMLUser newXMLUser() {
		return (new XMLUser("zied", "zied"));
	}

	// XMLJSONUser
	@RequestMapping(value = "newXJSONUser", produces = "application/json")
	public XMLJSONUser newXJSONUser() {
		return (new XMLJSONUser("json", "json"));
	}

	@RequestMapping(value = "newXMLJUser", produces = "application/xml")
	public XMLJSONUser newXMLJUser() {
		return (new XMLJSONUser("xml", "xml"));
	}

	// Course (with XML and JSon @)
	@RequestMapping(value = "newJSONCourse", produces = "application/json")
	public Course newJSONCourse() {
		return (new Course("zied", 20));
	}

	@RequestMapping(value = "newXMLCourse", produces = "application/xml")
	public Course newXMLCourse() {
		return (new Course("zied", 20));
	}

}
