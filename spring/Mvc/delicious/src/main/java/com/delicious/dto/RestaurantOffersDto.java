package com.delicious.dto;

import java.util.List;

public class RestaurantOffersDto {
	protected int restaurantNo;
	protected String restaurantName;
	protected String restaurantType;
	protected String openingHours;
	protected String closingHours;
	protected String area;
	protected List<OfferDto> offers;

	public RestaurantOffersDto(int restaurantNo, String restaurantName, String restaurantType, String openingHours,
			String closingHours, String area, List<OfferDto> offers) {
		super();
		this.restaurantNo = restaurantNo;
		this.restaurantName = restaurantName;
		this.restaurantType = restaurantType;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.area = area;
		this.offers = offers;
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

	public String getRestaurantType() {
		return restaurantType;
	}

	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getClosingHours() {
		return closingHours;
	}

	public void setClosingHours(String closingHours) {
		this.closingHours = closingHours;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<OfferDto> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferDto> offers) {
		this.offers = offers;
	}

}
