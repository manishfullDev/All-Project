package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "merchant_terms_and_conditions")
public class MerchantTermsAndConditions implements Serializable {
	@Id
	@Column(name = "merchant_no")
	@GeneratedValue(generator = "foreign_gen")
	@GenericGenerator(name = "foreign_gen", strategy = "foreign", parameters = {
			@Parameter(name = "property", value = "merchant") })
	protected int merchantNo;
	@Column(name = "effective_dt")
	protected Date effectiveDate;
	@Column(name = "commision_charges")
	protected double commisionCharges;
	@Column(name = "joining_charges")
	protected double joiningCharges;
	@Column(name = "annual_charges")
	protected double annualCharges;
	@Column(name = "delivery_charges")
	protected double deliveryCharges;
	@OneToOne
	@PrimaryKeyJoinColumn
	protected Merchant merchant;

}
