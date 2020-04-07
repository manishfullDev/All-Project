package com.mtml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "auction")
public class Auction implements Serializable {
	@Column(name = "auction_no")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int auctionNo;
	@Column(name = "auction_dt")
	protected Date auctionDate;
	@Column(name = "auction_title")
	protected String auctionTitle;
	protected String description;
	protected double fees;
	protected String status;

	@ManyToMany
	@JoinTable(name = "auction_participants", joinColumns = { @JoinColumn(name = "auction_no") }, inverseJoinColumns = {
			@JoinColumn(name = "participant_no") })
	@IndexColumn(name = "auction_pariticpant_reg_no", base = 1)
	protected List<Participant> participants;

	public int getAuctionNo() {
		return auctionNo;
	}

	public void setAuctionNo(int auctionNo) {
		this.auctionNo = auctionNo;
	}

	public Date getAuctionDate() {
		return auctionDate;
	}

	public void setAuctionDate(Date auctionDate) {
		this.auctionDate = auctionDate;
	}

	public String getAuctionTitle() {
		return auctionTitle;
	}

	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "Auction [auctionNo=" + auctionNo + ", auctionDate=" + auctionDate + ", auctionTitle=" + auctionTitle
				+ ", description=" + description + ", fees=" + fees + ", status=" + status + ", participants="
				+ participants + "]";
	}

}
