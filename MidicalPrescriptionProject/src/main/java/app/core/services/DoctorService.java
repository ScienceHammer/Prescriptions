package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.Prescription;
import app.core.repositories.DoctorRepository;
import app.core.repositories.PrescriptionRepository;

@Service
@Transactional
@Scope("prototype")
public class DoctorService {
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	public Prescription addPrescription (Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}
	
	public List<Prescription> getAllPrescriptions () {
		return prescriptionRepository.findAll();
	}
	


}
