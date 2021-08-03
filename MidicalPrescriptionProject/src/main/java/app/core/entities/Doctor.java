package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
	@Column(unique = true)
	private Integer liscenceNumber;
	private String medicAdress;

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

}
