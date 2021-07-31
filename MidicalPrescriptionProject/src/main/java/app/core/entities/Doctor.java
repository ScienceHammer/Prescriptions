package app.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private Integer liscenceNumber;
	private String medicAdress;
	@OneToOne
	private User doctorUser;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public User getDoctorUser() {
		return doctorUser;
	}

	public void setDoctorUser(User doctorUser) {
		this.doctorUser = doctorUser;
	}



}
