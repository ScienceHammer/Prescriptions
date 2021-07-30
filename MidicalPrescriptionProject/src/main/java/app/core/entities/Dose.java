package app.core.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import app.core.enums.DoseFrequency;
import app.core.enums.DoseType;
import app.core.enums.Units;

@Entity
public class Dose {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private DoseType doseType;
	private Integer doseAmount;
	private Double dosage;
	private Units dosageUnit;
	private DoseFrequency frequency;
	private Integer numberOfTakingDays;
	@ManyToMany
	private List<Medicine> medicines;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DoseType getDoseType() {
		return doseType;
	}

	public void setDoseType(DoseType doseType) {
		this.doseType = doseType;
	}

	public Integer getDoseAmount() {
		return doseAmount;
	}

	public void setDoseAmount(Integer doseAmount) {
		this.doseAmount = doseAmount;
	}

	public Double getDosage() {
		return dosage;
	}

	public void setDosage(Double dosage) {
		this.dosage = dosage;
	}

	public Units getDosageUnit() {
		return dosageUnit;
	}

	public void setDosageUnit(Units dosageUnit) {
		this.dosageUnit = dosageUnit;
	}

	public DoseFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(DoseFrequency frequency) {
		this.frequency = frequency;
	}

	public Integer getNumberOfTakingDays() {
		return numberOfTakingDays;
	}

	public void setNumberOfTakingDays(Integer numberOfTakingDays) {
		this.numberOfTakingDays = numberOfTakingDays;
	}

}
