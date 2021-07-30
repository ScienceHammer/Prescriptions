package app.core.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import app.core.enums.DoseFrequency;
import app.core.enums.DoseType;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String activeSubstance;
	private Long registrationNumber;
	@OneToMany
	private List<Dose> doses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActiveSubstance() {
		return activeSubstance;
	}

	public void setActiveSubstance(String activeSubstance) {
		this.activeSubstance = activeSubstance;
	}

	public Long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public List<Dose> getDoses() {
		return doses;
	}

	public void setDoses(List<Dose> doses) {
		this.doses = doses;
	}

}
