package app.core.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import app.core.enums.Gender;
import app.core.enums.Roles;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private Integer userIdNumber;
	private Integer phoneNumber;
	@Column(unique = true)
	private String username;
	private String password;
	private Roles role;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Doctor doctor;
	@Column(unique = true)
	private String email;
	private String firsName;
	private String lastName;
	private Gender gender;
	private Date birthDay;
	private String address;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Prescription> userPrescriptions;
	@OneToMany
	private List<Mail> mails;
	private boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserIdNumber() {
		return userIdNumber;
	}

	public void setUserIdNumber(Integer userIdNumber) {
		this.userIdNumber = userIdNumber;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public List<Prescription> getUserPrescriptions() {
		return userPrescriptions;
	}

	public void setUserPrescriptions(List<Prescription> userPrescriptions) {
		this.userPrescriptions = userPrescriptions;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userIdNumber=" + userIdNumber + ", phoneNumber=" + phoneNumber + ", username="
				+ username + ", password=" + password + ", role=" + role + ", doctor=" + doctor + ", email=" + email
				+ ", firsName=" + firsName + ", lastName=" + lastName + ", gender=" + gender + ", birthDay=" + birthDay
				+ ", address=" + address + ", userPrescriptions=" + userPrescriptions + ", active=" + active + "]";
	}
	
	

}
