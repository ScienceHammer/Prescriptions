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
	private String activeSubstance ;
	private Long registrationNumber;
	@OneToMany
	private List<Dose> doses;
	
	

}
