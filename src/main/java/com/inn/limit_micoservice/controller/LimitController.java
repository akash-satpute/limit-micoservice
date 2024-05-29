package com.inn.limit_micoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.limit_micoservice.beans.Limits;
import com.inn.limit_micoservice.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}

}
