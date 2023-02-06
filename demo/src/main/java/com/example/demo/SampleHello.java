package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleHello {
	@Autowired
    private usersrepository userRepository;
	
	@RequestMapping(value="LogIn",method = RequestMethod.POST)
	public String sample(@RequestParam String name,@RequestParam String password, ModelMap model){
        List<users> users = userRepository.findByname(name);
        if(users.size()>0){
            if(users.get(0).getPassword().contentEquals(password)){
            	model.put("name", users.get(0).getName());
            	return "SampleHello";
            }
            else {
        		return "LogIn";
            }
        }
        else {
    		return "LogIn";
        }
	}
	
	@RequestMapping(value="LogIn",method = RequestMethod.GET)
	public String LogIn(){
		return "LogIn";
	}
	
	
	@RequestMapping("sample")
	@ResponseBody
	public String sample(){
		return "sample1";
	}
}
