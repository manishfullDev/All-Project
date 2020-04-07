package com.delicious.dto;

public class OfferDto {
	protected int offerNo;
	protected String offerCode;
	protected String description;
	protected float minimumBillAmount;
	protected int offerValue;
	protected String offerValueType;

	public OfferDto(int offerNo, String offerCode, String description, float minimumBillAmount, int offerValue,
			String offerValueType) {
		super();
		this.offerNo = offerNo;
		this.offerCode = offerCode;
		this.description = description;
		this.minimumBillAmount = minimumBillAmount;
		this.offerValue = offerValue;
		this.offerValueType = offerValueType;
	}

	public int getOfferNo() {
		return offerNo;
	}

	public void setOfferNo(int offerNo) {
		this.offerNo = offerNo;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getMinimumBillAmount() {
		return minimumBillAmount;
	}

	public void setMinimumBillAmount(float minimumBillAmount) {
		this.minimumBillAmount = minimumBillAmount;
	}

	public int getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(int offerValue) {
		this.offerValue = offerValue;
	}

	public String getOfferValueType() {
		return offerValueType;
	}

	public void setOfferValueType(String offerValueType) {
		this.offerValueType = offerValueType;
	}

}
