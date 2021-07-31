package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
