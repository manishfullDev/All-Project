package com.otmm.entities;

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
@Table(name = "package")
public class Package implements Serializable {
	@Id
	@Column(name = "package_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int packageNo;
	@Column(name = "booking_dt")
	protected Date bookingDate;
	protected int weight;
	@Column(name = "source_address")
	protected String sourceAddress;
	@Column(name = "destination_address")
	protected String destinationAddress;
	protected double charges;

}
