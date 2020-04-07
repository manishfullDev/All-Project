package com.otmoto.test;

import java.util.Date;

import com.otmoto.accessor.ProductAccessor;
import com.otmoto.accessor.WarrantyAccessor;
import com.otmoto.entities.Product;
import com.otmoto.entities.Warranty;

public class OTMOTOTest {
	public static void main(String[] args) {
		Product product = null;
		Warranty warranty = null;
		ProductAccessor productAccessor = null;
		WarrantyAccessor warrantyAccessor = null;

		warrantyAccessor = new WarrantyAccessor();
		productAccessor = new ProductAccessor();
		
		warranty = new Warranty();
		warranty.setWarrantyInMonths(36);
		warranty.setEffectiveDate(new Date());
		warranty.setExpiryDate(new Date());
		warranty.setTermsAndConditions("Liquid damage not covered");
		warranty.setRetailerBusinessName("Ganesh Retails");
		int wno = warrantyAccessor.saveWarranty(warranty);
		System.out.println("warrantyNo :  " + wno);

		product = new Product();
		product.setManufacturedDate(new Date());
		product.setManufacturerName("Mi");
		product.setProductName("Note 7 Pro");
		product.setPrice(7849);
		product.setWarranty(warranty);
		
		int pno = productAccessor.saveProduct(product);
		System.out.println("productNo : " + pno);
		product = productAccessor.getProduct(1);
		System.out.println(product);
	}
}




















