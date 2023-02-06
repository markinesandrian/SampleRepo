package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class LogInService {
	@Autowired
    private usersrepository userRepository;
	
	public String GetUsers() {
        java.util.List<users> users = userRepository.findAll();
		return users.toString();
	}
	public Boolean ValidateUser(String Name, String Password) {
        List<users> users = userRepository.findByname(Name);
        if(users.size()>0){
            if(users.get(0).getPassword().contentEquals(Password)){
            	return true;
            }
        }
		return false;
	}
}
