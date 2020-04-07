package com.otml.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "patient")
public class Patient implements Serializable {
	@Id
	@Column(name = "patient_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int patientNo;
	@Column(name = "patient_nm")
	protected String patientName;
	protected int age;
	protected String gender;
	@Column(name = "mobile_nbr")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;

	@OneToMany
	@JoinColumn(name = "patient_no")
	@OrderColumn(name = "patient_appoinement_seq_no")
	protected List<Appointment> appointments;

}
