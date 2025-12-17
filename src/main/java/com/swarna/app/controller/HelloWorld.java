package com.swarna.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarna.app.customException.UserNotFoundException;

@RestController
@RequestMapping("/api")
public class HelloWorld {
	
	//With ResponseEntity
	@GetMapping("/greeting/{test}")
	public ResponseEntity<String> sayHello(@PathVariable String test) {
		if(test.equals("SUCESS")) {
			int s = 2/0;
			return ResponseEntity.status(HttpStatus.OK).body("Hi Swarna, Good morning");
		} else {
			throw new UserNotFoundException("User not found");
		}
	}
	
	//without responseEntity
	
//	@GetMapping("/greeting")
//	public String sayHello() {
//		return "Hi Swarna, Good morning";
//	}
	
	
//	@ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<String> handle(UserNotFoundException ex) {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
//    }
	

}
