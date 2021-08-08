package app.core.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private Integer liscenceNumber;
	private String medicAddress;

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

	public String getMedicAddress() {
		return medicAddress;
	}

	public void setMedicAddress(String medicAddress) {
		this.medicAddress = medicAddress;
	}

}
