package com.hello.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

	@Autowired
    private Environment env;

	@GetMapping("/hello")
	public ResponseEntity<String> getHello(Model model) {	
		return new ResponseEntity<String>( env.getProperty("message"), HttpStatus.OK);
	}
}