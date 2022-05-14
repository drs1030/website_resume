package com.website.dalton_resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {
	
@GetMapping("test")
public String testMethod() {
	return "test";
}

}
