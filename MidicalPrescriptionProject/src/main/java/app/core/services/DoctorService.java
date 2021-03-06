package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.entities.Prescription;
import app.core.entities.User;
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

	public Prescription addPrescription(Long doctorId, Prescription prescription, Long patientUserId) {
		User doctorUser = userRepository.getById(doctorId);
		User patientUser = userRepository.getById(patientUserId);
		prescription.setPatient(patientUser);
		prescription.setDoctor(doctorUser);
		return prescriptionRepository.save(prescription);
	}

	public List<Prescription> getAllDoctorPrescriptions(Long doctorId) {
		return prescriptionRepository.findByDoctorId(doctorId);
	}

	public List<Prescription> getAllPatientPrescriptions(Long userId) {
		return prescriptionRepository.findByPatientId(userId);
	}

}
