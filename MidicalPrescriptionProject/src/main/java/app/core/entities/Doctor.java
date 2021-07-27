package app.core.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer liscenceNumber;
	private String medicAdress;
	@OneToOne
	private User userDetails;
	@JsonIgnore
	@OneToMany
	private List<Prescription> prescriptions;

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

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

}
