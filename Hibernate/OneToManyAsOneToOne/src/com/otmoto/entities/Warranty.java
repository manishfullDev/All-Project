package com.otmoto.entities;

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
@Table(name = "warranty")
public class Warranty implements Serializable {
	@Id
	@Column(name = "warranty_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int warrantyNo;
	@Column(name = "warranty_in_months")
	protected int warrantyInMonths;
	@Column(name = "terms_and_conditions")
	protected String termsAndConditions;
	@Column(name = "effective_dt")
	protected Date effectiveDate;
	@Column(name = "expiry_dt")
	protected Date expiryDate;
	@Column(name = "retailer_business_nm")
	protected String retailerBusinessName;

}
