package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/api/test")
public class TestController {

	public TestController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	@ResponseBody
	public String index() {
		System.out.println("index");
		return "Welcome !!!";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		System.out.println("test");
		return "test";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("test");
		return "helloworld";
	}

//	@PostMapping("/post")
//	public String post(@RequestHeader String lang) throws IOException {
//		System.out.println(lang);
//		return lang;
//	}

}
