package com.laxpolicedpt.civilrewiew.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "charges")
public class Charges {

	@Id
	@JsonProperty()
	@Column(name = "id")
	private Integer id;
	
	
	@JsonProperty("charges")
	@Column(name = "charges")
	private String name;
	
	@JsonProperty("charges_date")
	@Column(name = "chargesdate")
	private String chargesdate;
	
	@JsonProperty("status_detention")
	@Column(name = "statusdetention")
	private String status;
	
	@ManyToOne()
	@JoinColumn(name = "idcivil")
	private Civil civil;

	
	

	public Integer getCivil() {
		return civil.getId();
	}

	public void setCivil(Civil civil) {
		this.civil = civil;
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

	public String getChargesdate() {
		return chargesdate;
	}

	public void setChargesdate(String chargesdate) {
		this.chargesdate = chargesdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
}
