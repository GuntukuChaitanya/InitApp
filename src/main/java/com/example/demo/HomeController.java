package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
@RequestMapping(value="/home")	
public static String Welcome() {
	return "Welcome to Home Controller";
}
}
