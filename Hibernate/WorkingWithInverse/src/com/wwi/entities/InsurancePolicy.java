package com.wwi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "insurance_policy")
public class InsurancePolicy implements Serializable {
	@Id
	@Column(name = "enrollment_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int enrollmentNo;
	@Column(name = "plan_no")
	protected String planNo;
	@Column(name = "policy_effective_dt")
	protected Date policyEffectiveDate;
	@Column(name = "policy_expiry_dt")
	protected Date policyExpiryDate;
	@Column(name = "sum_insurred")
	protected double sumInsurred;
	protected String status;

	@ManyToOne
	@JoinColumn(name = "member_no", nullable = true)
	protected Member member;
}
















