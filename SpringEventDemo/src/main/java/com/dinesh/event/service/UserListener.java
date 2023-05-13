package com.dinesh.event.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.dinesh.event.model.User;

@Service
public class UserListener {
	
	@EventListener
	public void handler(User user) {
		
		System.out.println("User "+ user.getName() +" added");
		
		
	}

}
