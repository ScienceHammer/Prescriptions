package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.User;
import app.core.repositories.UserRepository;

@Service
@Transactional
@Scope("prototype")
public class UsersService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User addUser(User user) {
		
		return userRepository.save(user);
		
	}
	
	
	
	

}
