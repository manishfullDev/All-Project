package com.otmm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "shippment")
public class Shippment implements Serializable {
	@Id
	@Column(name = "shippment_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int shippmentNo;
	@Column(name = "shippment_dt")
	protected Date shippmentDate;
	@Column(name = "incharge_nm")
	protected String inChargeName;
	@Column(name = "expected_delivery_dt")
	protected Date expectedDeliveryDate;
	@Column(name = "contact_no")
	protected String contactNo;
	@Column(name = "shipping_company_nm")
	protected String shippingCompanyName;
	protected String status;

	@OneToMany
	@JoinColumn(name = "shippment_no")
	@MapKeyColumn(name = "tracking_no", nullable = true)
	protected Map<String, Package> packages;
}
