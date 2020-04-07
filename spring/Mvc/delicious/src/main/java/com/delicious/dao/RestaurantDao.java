package com.delicious.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.delicious.bo.OfferBo;
import com.delicious.bo.RestaurantBo;
import com.delicious.bo.RestaurantOffersBo;

public class RestaurantDao {
	private final String SQL_GET_RESTAURANTS_WITH_OFFERS = "select r.restaurant_no, restaurant_nm, restaurant_type, opening_hours, closing_hours, address_line1, city, state, area_nm, zip, country, contact_no, email_address , offer_no, offer_code, description, min_bill_amount, offer_value, offer_value_type, status from restaurant r inner join restaurant_offers ro on r.restaurant_no = ro.restaurant_no order by restaurant_nm";
	private JdbcTemplate jdbcTemplate;

	public RestaurantDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<RestaurantOffersBo> getRestaurantsWithOffers() {
		return jdbcTemplate.query(SQL_GET_RESTAURANTS_WITH_OFFERS, (rs) -> {
			List<RestaurantOffersBo> restaurantOffers = null;
			Map<Integer, RestaurantOffersBo> restaurantOffersMap = null;
			RestaurantOffersBo restaurantOffersBo = null;
			RestaurantBo restaurantBo = null;
			OfferBo offerBo = null;
			int restaurantNo = 0;

			restaurantOffersMap = new HashMap<>();

			while (rs.next()) {
				restaurantNo = rs.getInt(1);
				if (restaurantOffersMap.containsKey(restaurantNo) == false) {
					restaurantBo = new RestaurantBo();
					restaurantBo.setRestaurantNo(restaurantNo);
					restaurantBo.setRestaurantName(rs.getString(2));
					restaurantBo.setRestaurantType(rs.getString(3));
					restaurantBo.setOpeningHours(rs.getString(4));
					restaurantBo.setClosingHours(rs.getString(5));
					restaurantBo.setAddressLine1(rs.getString(6));
					restaurantBo.setCity(rs.getString(7));
					restaurantBo.setState(rs.getString(8));
					restaurantBo.setArea(rs.getString(9));
					restaurantBo.setZip(rs.getInt(10));
					restaurantBo.setCountry(rs.getString(11));
					restaurantBo.setContactNo(rs.getString(12));
					restaurantBo.setEmailAddress(rs.getString(13));
					restaurantOffersBo = new RestaurantOffersBo(restaurantBo, new ArrayList<>());
					restaurantOffersMap.put(restaurantNo, restaurantOffersBo);
				}
				offerBo = new OfferBo();
				offerBo.setOfferNo(rs.getInt(14));
				offerBo.setOfferCode(rs.getString(15));
				offerBo.setDescription(rs.getString(16));
				offerBo.setMinimumBillAmount(rs.getFloat(17));
				offerBo.setOfferValue(rs.getInt(18));
				offerBo.setOfferValueType(rs.getString(19));
				offerBo.setStatus(rs.getString(20));
				restaurantOffersBo = restaurantOffersMap.get(restaurantNo);
				restaurantOffersBo.getOffers().add(offerBo);
			}
			restaurantOffers = new ArrayList<>();
			for (RestaurantOffersBo bo : restaurantOffersMap.values()) {
				restaurantOffers.add(bo);
			}
			return restaurantOffers;
		});
	}
}
