package app.core.entities;



import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import app.core.enums.DoseFrequency;
import app.core.enums.DoseType;
import app.core.enums.Gender;
import app.core.enums.Units;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String doctorName;
	private Integer doctorPhoneNumber;
	private Integer doctorLiscenceNumber;
	private String medicAdress;
	private String reason;
	@OneToMany
	private List<PrescripedMed> prescripedMeds;
	private Integer patientIdNumber;
	private Integer patientPhoneNumber;
	private String patientName;
	private Gender patientGender;
	private Date patientBirthDay;
	private String patientAddress;
	
	
	
	

}
