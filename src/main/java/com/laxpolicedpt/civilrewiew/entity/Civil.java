package com.laxpolicedpt.civilrewiew.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "civil")
public class Civil {

	@Id
	@JsonProperty()
	@Column(name = "idcivil")
	private Integer id;

	
	@JsonProperty("name")
	@Column(name = "name")
	private String name;
	
	@JsonProperty("last_name")
	@Column(name = "lastname")
	private String lastName;
	
	
	
	@JsonProperty("native_town")
	@Column(name = "nativetown")
	private String nativeTown;
	
	@JsonProperty("nacionality")
	@Column(name = "nacionality")
	private String nacionality;
	
	@JsonProperty("birth_date")
	@Column(name = "birth")
	private String birthDate;
	
	@JsonProperty("passport_number")
	@Column(name = "passportnumber")
	private String passportNumber;
	
	@ManyToMany(mappedBy = "civil")
	private List<Charges> charges;

	

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<Charges> charges) {
		this.charges = charges;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getNativeTown() {
		return nativeTown;
	}

	public void setNativeTown(String nativeTown) {
		this.nativeTown = nativeTown;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	
	
	
	
}
