package com.hzfi.encrypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzfi.encrypt.service.UserService;

@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/batchCreateUser")
	public String batchCreateUser(){
		
		return userService.batchCreateUser();
	}
	
	@PostMapping("/createUser")
	public String createUser(@RequestParam String id){
		
		return userService.createUser(id);
	}
	
	@PostMapping("/find")
	public String findUser(@RequestParam String id){
		return userService.findUser(id);
	}
}
