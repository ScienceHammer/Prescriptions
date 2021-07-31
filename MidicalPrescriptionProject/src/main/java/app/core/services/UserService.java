package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.Mail;
import app.core.entities.Prescription;
import app.core.entities.User;
import app.core.repositories.MailRepository;
import app.core.repositories.PrescriptionRepository;
import app.core.repositories.UserRepository;

@Service
@Transactional
@Scope("prototype")
public class UserService {
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	@Autowired
	private MailRepository mailRepository;
	
	private User user;
	
	public List<Prescription> getAllPrescriptions () {
		return prescriptionRepository.findByPatientId(user.getId());
	}

}
