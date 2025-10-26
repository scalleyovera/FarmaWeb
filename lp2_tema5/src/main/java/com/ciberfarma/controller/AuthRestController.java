package com.ciberfarma.controller;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/authentication")
@RequiredArgsConstructor
public class AuthRestController {

	@PostMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@PostMapping(value = "/register")
	public String register() {
		return "register";
	}
	
}
