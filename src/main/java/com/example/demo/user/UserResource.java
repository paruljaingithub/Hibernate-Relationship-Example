package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/create", method=RequestMethod.GET)
	public String createUser() {
		
		this.userService.saveUser();
		return "success";
	}
	
	@RequestMapping(value="/user/fetch", method=RequestMethod.GET)
	@Transactional
	public List<UserDTO> getUser() {
		
		return  this.userService.getUsers();
	}
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public String checkingService() {
		
		return "greeting";
	}
}
