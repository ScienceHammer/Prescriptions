package app.core.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private List<String> tradesNames;
	private List<String> belongsToGroups;
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

	public List<String> getTradesNames() {
		return tradesNames;
	}

	public void setTradesNames(List<String> tradesNames) {
		this.tradesNames = tradesNames;
	}

	public List<String> getBelongsToGroups() {
		return belongsToGroups;
	}

	public void setBelongsToGroups(List<String> belongsToGroups) {
		this.belongsToGroups = belongsToGroups;
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
