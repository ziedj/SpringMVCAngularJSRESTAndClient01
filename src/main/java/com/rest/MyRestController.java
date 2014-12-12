package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domains.User;

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

	@RequestMapping(value = "/newUser")
	public User newUser() {
		return (new User("zied", "zied"));
	}

}
