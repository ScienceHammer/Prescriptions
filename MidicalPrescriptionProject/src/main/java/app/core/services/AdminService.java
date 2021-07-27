package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Medicine;
import app.core.repositories.MedicineRepository;
import app.core.repositories.PrescriptionRepository;
import app.core.repositories.UserRepository;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	
	public Medicine addMedicine (Medicine medicine) {
		
		return medicineRepository.save(medicine);
		
	}

}
