package com.mtms.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "tour")
public class Tour implements Serializable {
	@Id
	@Column(name = "tour_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int tourNo;
	@Column(name = "package_nm")
	protected String packageName;
	@Column(name = "planned_dt")
	protected Date plannedDate;
	protected int days;
	@Column(name = "tour_manager_nm")
	protected String tourManagerName;
	@Column(name = "enquiry_no")
	protected String enquiryNo;
	@Column(name = "enquiry_email_adress")
	protected String enquiryEmailAddress;
	protected double cost;
	@ManyToMany
	@JoinTable(name = "tour_passengers", joinColumns = { @JoinColumn(name = "tour_no") }, inverseJoinColumns = {
			@JoinColumn(name = "passenger_no") })
	protected Set<Passenger> passengers;
}















