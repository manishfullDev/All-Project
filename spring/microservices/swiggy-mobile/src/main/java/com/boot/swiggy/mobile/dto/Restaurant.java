package com.boot.swiggy.mobile.dto;

public class Restaurant {
	protected int restaurantNo;
	protected String restaurantName;
	protected String cuisine;
	protected String contactNo;
	protected String emailAddress;

	public int getRestaurantNo() {
		return restaurantNo;
	}

	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantNo=" + restaurantNo + ", restaurantName=" + restaurantName + ", cuisine="
				+ cuisine + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + "]";
	}

}
