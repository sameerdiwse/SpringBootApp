package com.it.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it.model.User;
import com.it.services.IUserService;

@Controller
@RequestMapping("test")
public class Controller0 
{
	 @Autowired
	 IUserService iUserService;
	 
	@RequestMapping(value="Really", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> Really(@RequestBody User user) 
	{
		User d = iUserService.SaveUser(user);
		
		ResponseEntity<User> responseEntity = new ResponseEntity<>(d,HttpStatus.OK);
		
		return responseEntity;
	}
	
}
