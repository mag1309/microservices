package com.example.client.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="hello-service", url="http://localhost:8080/")
public interface HelloProxy {

	@GetMapping("/rest-hello/{name}")
	public ResponseEntity<String> getHello(@PathVariable(value="name") String name);
}
