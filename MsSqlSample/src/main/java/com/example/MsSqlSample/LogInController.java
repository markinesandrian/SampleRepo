package com.example.MsSqlSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
@Controller
public class LogInController {
	
	@Autowired
	private LogInService LogInService;
	
	@RequestMapping(value="LogIn",method = RequestMethod.POST)
	public String LogIn(@RequestParam String name,@RequestParam String password, ModelMap model){
        if(LogInService.ValidateUser(name,password)){
            model.put("name", name);
            return "SampleHello";
        }
        else {
    		return "LogIn";
        }
	}

	@RequestMapping(value="LogIn",method = RequestMethod.GET)
	public String LogIn(){
		return "LogIn";
	}
	
	@RequestMapping(value="Users",method = RequestMethod.GET)
	public String Users(ModelMap model){
		String users = LogInService.GetUsers();
    	model.put("name", users);
		return "SampleHello";
	}

	@RequestMapping("sample")
	@ResponseBody
	public String sample(){
		return "sample2";
	}
}
