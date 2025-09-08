package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//annotations
@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String show() {
		return "index";
	}
}
