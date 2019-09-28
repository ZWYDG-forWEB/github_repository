package com.ZWYDG.catering_management.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
public class TestController {

	@RequestMapping("/spring")
	public String test(String ID) {
		System.out.println("run");
	        return "zero";

}}
