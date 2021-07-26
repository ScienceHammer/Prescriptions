package app.core.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private User doctorUser;
	private Integer liscenceNumber;
	private String medicAdress;
	@OneToMany
	private List<Prescription> prescriptions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getDoctorUser() {
		return doctorUser;
	}

	public void setDoctorUser(User doctorUser) {
		this.doctorUser = doctorUser;
	}

	public Integer getLiscenceNumber() {
		return liscenceNumber;
	}

	public void setLiscenceNumber(Integer liscenceNumber) {
		this.liscenceNumber = liscenceNumber;
	}

	public String getMedicAdress() {
		return medicAdress;
	}

	public void setMedicAdress(String medicAdress) {
		this.medicAdress = medicAdress;
	}

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

}
