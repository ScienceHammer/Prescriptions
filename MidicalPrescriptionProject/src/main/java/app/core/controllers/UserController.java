package app.core.controllers;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.User;

@RestController
@RequestMapping("/api/patient")
public class UserController {

	@GetMapping("/hello")
	public String home(@RequestHeader String Authorization) {
		return ("<h1>Patient</h1>");
	}

	@GetMapping("/getAllPrescription")
	public String getAllPrescription(@RequestHeader String Authorization, Authentication  authentication) {

		User user = (User) authentication.getPrincipal();
		System.out.println(user.getDoctor().getLiscenceNumber());
		return  authentication.getName();

	}

}
