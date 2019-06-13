package com.jaya.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloController {
	
	@GetMapping("/principal")
	private Principal hello(Principal principal)
	{
		return principal;
	}

}
