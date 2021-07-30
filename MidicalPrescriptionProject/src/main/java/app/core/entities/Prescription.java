package app.core.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import app.core.enums.DoseFrequency;
import app.core.enums.DoseType;
import app.core.enums.Gender;
import app.core.enums.Units;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String doctorName;
	private Integer doctorPhoneNumber;
	private Integer doctorLiscenceNumber;
	private String medicAdress;
	private String reason;
	@OneToMany
	private List<PrescripedMed> prescripedMeds;
	private Integer patientIdNumber;
	private Integer patientPhoneNumber;
	private String patientName;
	private Gender patientGender;
	private Date patientBirthDay;
	private String patientAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Integer getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}

	public void setDoctorPhoneNumber(Integer doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}

	public Integer getDoctorLiscenceNumber() {
		return doctorLiscenceNumber;
	}

	public void setDoctorLiscenceNumber(Integer doctorLiscenceNumber) {
		this.doctorLiscenceNumber = doctorLiscenceNumber;
	}

	public String getMedicAdress() {
		return medicAdress;
	}

	public void setMedicAdress(String medicAdress) {
		this.medicAdress = medicAdress;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<PrescripedMed> getPrescripedMeds() {
		return prescripedMeds;
	}

	public void setPrescripedMeds(List<PrescripedMed> prescripedMeds) {
		this.prescripedMeds = prescripedMeds;
	}

	public Integer getPatientIdNumber() {
		return patientIdNumber;
	}

	public void setPatientIdNumber(Integer patientIdNumber) {
		this.patientIdNumber = patientIdNumber;
	}

	public Integer getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	public void setPatientPhoneNumber(Integer patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Gender getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(Gender patientGender) {
		this.patientGender = patientGender;
	}

	public Date getPatientBirthDay() {
		return patientBirthDay;
	}

	public void setPatientBirthDay(Date patientBirthDay) {
		this.patientBirthDay = patientBirthDay;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

}
