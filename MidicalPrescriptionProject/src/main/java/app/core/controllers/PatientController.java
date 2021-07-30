package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	@GetMapping("/hello")
	public String home(@RequestHeader String Authorization) {
		return ("<h1>Patient</h1>");
	}

}
