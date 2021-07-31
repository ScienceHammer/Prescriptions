package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Mail;

public interface MailRepository extends JpaRepository<Mail, Long> {

}
