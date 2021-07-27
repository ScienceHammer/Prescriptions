package app.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import app.core.enums.MedicineDurations;
import app.core.enums.MedicineWayOfTaking;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private MedicineWayOfTaking medWayOfTaking;
	private MedicineDurations duration;
	private Integer dosAmount;
	private Integer Cycles;
	private Integer medPeriodTime;

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

	public MedicineWayOfTaking getMedWayOfTaking() {
		return medWayOfTaking;
	}

	public void setMedWayOfTaking(MedicineWayOfTaking medWayOfTaking) {
		this.medWayOfTaking = medWayOfTaking;
	}

	public MedicineDurations getDuration() {
		return duration;
	}

	public void setDuration(MedicineDurations duration) {
		this.duration = duration;
	}

	public Integer getDosAmount() {
		return dosAmount;
	}

	public void setDosAmount(Integer dosAmount) {
		this.dosAmount = dosAmount;
	}

	public Integer getCycles() {
		return Cycles;
	}

	public void setCycles(Integer cycles) {
		Cycles = cycles;
	}

	public Integer getMedPeriodTime() {
		return medPeriodTime;
	}

	public void setMedPeriodTime(Integer medPeriodTime) {
		this.medPeriodTime = medPeriodTime;
	}

}
