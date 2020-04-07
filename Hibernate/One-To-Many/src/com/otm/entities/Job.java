package com.otm.entities;

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

@Getter
@Setter
@ToString
@Entity
@Table(name = "job")
public class Job implements Serializable {
	@Id
	@Column(name = "job_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int jobNo;
	protected String title;
	protected String description;
	@Column(name = "opened_dt")
	protected Date openedDate;
	@Column(name = "close_dt")
	protected Date closeDate;
	protected String designation;
	protected int experience;

}
