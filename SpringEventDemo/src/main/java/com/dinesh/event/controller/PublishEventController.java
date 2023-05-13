package com.dinesh.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.event.model.User;
import com.dinesh.event.service.PublishEvent;

@RestController
@RequestMapping("/event")
public class PublishEventController {
	
	@Autowired
	PublishEvent event;
	
	@PostMapping("/publish")
	public ResponseEntity<String> CallEvent(@RequestBody User user){
		
		event.addUser(user);
		return new ResponseEntity<String>("User added",HttpStatus.ACCEPTED);
		
		
	}

}
