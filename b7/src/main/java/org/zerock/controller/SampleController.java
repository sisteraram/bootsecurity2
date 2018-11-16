package org.zerock.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.B7Application;

@Controller
public class SampleController {
	
	@GetMapping("/hello")
	public void hello() {
	}
	
}
