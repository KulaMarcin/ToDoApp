package kula.marcin.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		return "login";
		
	}

	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
	
}









