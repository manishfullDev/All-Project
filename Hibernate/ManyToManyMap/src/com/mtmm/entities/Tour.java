package com.mtmm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
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
	@Column(name = "planned_dt")
	protected Date plannedDate;
	@Column(name = "package_nm")
	protected String packageName;
	protected int days;
	protected String description;
	protected double cost;

	@ManyToMany
	@JoinTable(name = "tour_passengers", joinColumns = { @JoinColumn(name = "tour_no") }, inverseJoinColumns = {
			@JoinColumn(name = "passenger_no") })
	@MapKeyColumn(name = "booking_no")
	protected Map<String, Passenger> passengers;

}
