package app.core.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);
	
}
