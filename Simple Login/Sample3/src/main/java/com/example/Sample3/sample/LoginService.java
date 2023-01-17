package com.example.Sample3.sample;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean CanAccess(String name) {
		return name.equalsIgnoreCase("takamiya");
	}
}
