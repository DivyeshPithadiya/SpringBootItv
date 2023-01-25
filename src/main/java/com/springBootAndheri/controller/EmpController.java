package com.springBootAndheri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, This is an API!";
	}
	
	// http://localhost:9090/sum/2/2
	@GetMapping("/sum/{n1}/{n2}")
	public String sum(@PathVariable("n1") int num1,@PathVariable("n2") int num2) {
		return "Sum is: "+(num1+num2);
	}
	
	// http://localhost:9090/multi?num1=2&num2=2
	@GetMapping("/multi")
	public String multi(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
		return "Multiplication is: "+(num1*num2);
	}

}
