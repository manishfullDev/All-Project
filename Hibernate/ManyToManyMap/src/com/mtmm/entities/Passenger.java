package com.mtmm.entities;

import java.io.Serializable;

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
@Table(name = "passenger")
public class Passenger implements Serializable {
	@Id
	@Column(name = "passenger_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int passengerNo;
	@Column(name = "passenger_nm")
	protected String passengerName;
	protected int age;
	protected String gender;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;

}
