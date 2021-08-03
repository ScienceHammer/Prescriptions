package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Prescription;
import app.core.entities.User;
import app.core.services.DoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

	public String welcom() {
		return "welcome from doctor";
	}

	@PostMapping("/addPrescription")
	public Prescription addPrescription(@RequestHeader String Authorization, Authentication authentication,
			@RequestBody Prescription prescription, @RequestParam(required = false) Long patientUserId) {
		User user = (User) authentication.getPrincipal();
		return doctorService.addPrescription(user.getId(), prescription, patientUserId);

	}

}
