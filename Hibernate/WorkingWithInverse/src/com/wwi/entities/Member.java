package com.wwi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "member")
@NamedQueries({ @NamedQuery(name = "allMembers", query = "from Member m") })
public class Member implements Serializable {
	@Id
	@Column(name = "member_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int memberNo;
	@Column(name = "member_nm")
	protected String memberName;
	protected Date dob;
	protected String gender;
	@Column(name = "mobile_nbr")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;

	// One Member can have multiple policies, here we are holding all policies of
	// the member
	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	protected Set<InsurancePolicy> insurancePolicies;

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", dob=" + dob + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", insurancePolicies="
				+ insurancePolicies + "]";
	}

}
