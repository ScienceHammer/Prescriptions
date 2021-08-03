package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.Doctor;
import app.core.entities.Prescription;
import app.core.entities.User;
import app.core.repositories.DoctorRepository;
import app.core.repositories.PrescriptionRepository;
import app.core.repositories.UserRepository;

@Service
@Transactional
@Scope("prototype")
public class DoctorService {
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public Prescription addPrescription (Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}
	


	public Prescription addPrescription(Long id, Prescription prescription, Long patientUserId) {
		User doctorUser = userRepository.getById(id);
		User patientUser = userRepository.getById(patientUserId);
		prescription.setPatient(patientUser);
		prescription.setDoctor(doctorUser.getDoctor());
		return prescriptionRepository.save(prescription);
	}
	


}
