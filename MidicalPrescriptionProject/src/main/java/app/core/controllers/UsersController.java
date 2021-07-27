package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.UsersService;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UsersService usersService;

//	@PostMapping("/register")
//	public User registerUser(@RequestBody User user, @RequestParam(required = false) Roles role,
//			@RequestBody(required = false) Doctor docDetails) {
//		if(role == Roles.ROLE_DOC && docDetails != null) {
//			user.setRole(Roles.ROLE_DOC);
//			user.setDocDetails(docDetails);
//		}
//		return usersService.addUser(user);
//	}

}
