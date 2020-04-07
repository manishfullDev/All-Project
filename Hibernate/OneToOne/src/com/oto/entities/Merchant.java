package com.oto.entities;

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
@Table(name = "merchant")
public class Merchant implements Serializable {
	@Id
	@Column(name = "merchant_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int merchantNo;
	@Column(name = "business_nm")
	protected String businessName;
	@Column(name = "business_license_no")
	protected String businessLicenseNo;
	@Column(name = "business_type")
	protected String businessType;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "owner_nm")
	protected String ownerName;
	@Column(name = "business_contact_no")
	protected String businessContactNo;
	@Column(name = "business_email_address")
	protected String businessEmailAddress;
	protected String status;

}
