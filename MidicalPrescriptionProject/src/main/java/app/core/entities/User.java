package app.core.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import app.core.enums.Roles;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer userIdNumber;
	private Integer phoneNumber;
	private String username;
	private String password;
	@JsonIgnore
	private Roles role;
	@OneToOne
	private Doctor doctor;
	private String email;
	private String address;
	private Date birthDay;
	@JsonIgnore
	@OneToMany
	private List<Prescription> userPrescriptions;

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

}
