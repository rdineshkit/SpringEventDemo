package com.dinesh.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.dinesh.event.model.User;

@Service
public class PublishEvent {
	
	@Autowired
	ApplicationEventPublisher event;
	
	public void addUser(User user) {
		
		this.event.publishEvent(user);
		System.out.println("User Added method completed");
		
	}

}
