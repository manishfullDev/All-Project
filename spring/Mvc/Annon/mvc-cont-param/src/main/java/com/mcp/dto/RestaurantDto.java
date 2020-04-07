package com.mcp.dto;

public class RestaurantDto {
	protected int restaurantNo;
	protected String restaurantName;
	protected String contactNo;
	protected String emailAddress;

	public RestaurantDto(int restaurantNo, String restaurantName, String contactNo, String emailAddress) {
		super();
		this.restaurantNo = restaurantNo;
		this.restaurantName = restaurantName;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
	}

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

}
