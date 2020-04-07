package com.delicious.bo;

import java.io.Serializable;

public class OfferBo implements Serializable {
	protected int offerNo;
	protected String offerCode;
	protected String description;
	protected float minimumBillAmount;
	protected int offerValue;
	protected String offerValueType;
	protected String status;
	protected int restaurantNo;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRestaurantNo() {
		return restaurantNo;
	}

	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}

}
