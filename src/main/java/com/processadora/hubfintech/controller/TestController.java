package com.processadora.hubfintech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value="his")
	public String get() {
		return "TESTE";
	}
}
