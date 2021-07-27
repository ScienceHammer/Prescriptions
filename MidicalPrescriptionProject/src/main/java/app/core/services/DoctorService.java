package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import app.core.repositories.DoctorRepository;
import app.core.repositories.PrescriptionRepository;

@Service
@Transactional
@Scope("prototype")
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	


}
