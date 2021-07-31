package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.User;
import app.core.security.JwtTokenProvider;
import app.core.security.SecurityConstrains;
import app.core.services.UserAuthService;

@RestController
@RequestMapping("/api/auth")
public class UserAuthController {
	
	@Autowired
	private UserAuthService customeUserDetailsService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		
		return customeUserDetailsService.saveUser(user);
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(username, password));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = SecurityConstrains.TOKEN_PREFIX + jwtTokenProvider.generateToken(authentication);
		return jwt;
	}

}
