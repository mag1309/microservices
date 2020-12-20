package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.proxy.HelloProxy;

@RestController
public class FeignClientController {
	
	@Autowired
	HelloProxy proxy;
	
	@GetMapping("/feign/{name}")
	public ResponseEntity<String> getHello(@PathVariable String name) {
		return proxy.getHello(name);
	}

}
