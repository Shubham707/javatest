package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController @RequestMapping("login")
public class LoginController {

	@GetMapping("/login-user")
	public String users() {
		return "hello";
		
	}
	@GetMapping("/login-admin")
	public String admin() {
		return "hello admin";
		
	}

}
