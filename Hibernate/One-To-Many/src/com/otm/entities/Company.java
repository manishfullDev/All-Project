package com.otm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "company")
public class Company implements Serializable {
	@Id
	@Column(name = "company_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int companyNo;
	@Column(name = "business_nm")
	protected String businessName;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "contact_no")
	protected String contactNo;
	@Column(name = "email_address")
	protected String emailAddress;
	@Column(name = "hr_representative_nm")
	protected String hrRepresentativeName;

	@OneToMany
	@JoinColumn(name = "company_no")
	protected Set<Job> jobs;
}
