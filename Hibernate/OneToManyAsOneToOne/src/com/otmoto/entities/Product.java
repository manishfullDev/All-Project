package com.otmoto.entities;

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
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "product")
public class Product implements Serializable {
	@Id
	@Column(name = "product_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int productNo;
	@Column(name = "product_nm")
	protected String productName;
	@Column(name = "manufactured_dt")
	protected Date manufacturedDate;
	@Column(name = "manufacturer_nm")
	protected String manufacturerName;
	protected double price;

	@ManyToOne
	@JoinColumn(name = "warranty_no", unique = true)
	protected Warranty warranty;

}
