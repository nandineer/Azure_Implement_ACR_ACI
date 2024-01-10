package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	 @GetMapping("/home")
	    public String hello(){

	        return  "Project running successfully " ;
	    }

}
