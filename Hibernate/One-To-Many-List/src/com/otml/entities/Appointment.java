package com.otml.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {
	@Id
	@Column(name = "appointment_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int appointmentNo;
	@Column(name = "appointment_dt")
	protected Date appointmentDate;
	@Column(name = "doctor_nm")
	protected String doctorName;
	protected String remarks;
	protected String status;

}
