package com.example.MsSqlSample;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {
	@Autowired
    private UsersRepository userRepository;
	
	public String GetUsers() {
        java.util.List<Users> users = userRepository.findAll();
		return users.toString();
	}
	public Boolean ValidateUser(String Name, String Password) {
        List<Users> users = userRepository.findByname(Name);
        if(users.size()>0){
            if(users.get(0).getPassword().contentEquals(Password)){
            	return true;
            }
        }
		return false;
	}
}