package com.hello.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hello.example.config.ApplicationConfig;

@Controller
public class HelloController {
	
	@Autowired
	ApplicationConfig config;
	
	@GetMapping("/hello")
	public ResponseEntity<String> getHello(Model model) {	
		return new ResponseEntity<String>(config.getMsg(),HttpStatus.OK);
	}
}
