package com.example.Sample3.sample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleHello {
	private LoginService loginService;
	
	public SampleHello() {
		loginService  = new LoginService();
	}
	
	@RequestMapping(value="LogIn",method = RequestMethod.POST)
	public String sample(@RequestParam String name,@RequestParam String password, ModelMap model){
		if(loginService.CanAccess(name)) 
		{
			model.put("name", name);
			return "SampleHello";
		}
		else
		{
			return "LogIn";
		}
	}
	@RequestMapping(value="LogIn",method = RequestMethod.GET)
	public String LogIn(){
		return "LogIn";
	}
}
