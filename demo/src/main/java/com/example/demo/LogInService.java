package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class LogInService {
	@Autowired
    private usersrepository userRepository;
	
	public String GetUsers(String name) {
        java.util.List<users> users = userRepository.findAll();
		return users.toString();
	}
}
