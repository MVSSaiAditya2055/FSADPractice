package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
	@Autowired
	private CalcService service;
	//ADDITION - RequestParam
	//URL:http://localhost:8080/calculator
	@RequestMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a,b);
	}
	//SUBTRACTION - PathVariable
	//URL:http://localhost:8080/calculator
	@RequestMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a, @PathVariable int b) {
		return service.subtract(a, b);
	}
	//MULTIPLICATION - PathVariable
	@RequestMapping("/multiply/{a}/{b}")
	public int multiplication(@PathVariable int a, @PathVariable int b) {
		return service.multiply(a, b);
	}
	@RequestMapping("/divide")
	public double division(@RequestParam int a, @RequestParam int b) {
		return service.divide(a, b);
	}
	@RequestMapping("/modulo")
	public int modulo(@RequestParam int a, @RequestParam int b) {
		return service.modulo(a, b);
	}
}
