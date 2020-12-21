package com.edward.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumanController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value="name", required=false) String firstName) {
//		if(firstName == null) {
//			firstName = "Human";
//		}
//		return "<h1>Hello " + firstName + "!</h1>";
//	}

}
