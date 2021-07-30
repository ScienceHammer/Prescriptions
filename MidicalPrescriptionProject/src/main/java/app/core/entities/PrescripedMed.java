package app.core.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import app.core.enums.DoseFrequency;
import app.core.enums.DoseType;
import app.core.enums.Units;

public class PrescripedMed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String activeSubstance;
	private DoseType doseType;
	private Integer doseAmount;
	private Double dosage;
	private Units dosageUnit;
	private DoseFrequency frequency;
	private Integer numberOfTakingDays;

}
