package com.spring.boot.rocks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String hobbies;
	private String specialization;
	private String gender;
	private String nationality;

	public Employee() {
		super();
	}

	public Employee(String name, String email, String hobbies, String specialization, String gender,
			String nationality) {
		super();
		this.name = name;
		this.email = email;
		this.hobbies = hobbies;
		this.specialization = specialization;
		this.gender = gender;
		this.nationality = nationality;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", hobbies=" + hobbies
				+ ", specialization=" + specialization + ", gender=" + gender + ", nationality=" + nationality + "]";
	}
	
	

}
