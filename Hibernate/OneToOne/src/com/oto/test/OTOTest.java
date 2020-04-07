package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.Merchant;
import com.oto.entities.MerchantTermsAndConditions;
import com.oto.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class OTOTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Merchant merchant = null;
		MerchantTermsAndConditions merchantTermsAndConditions = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			merchant = new Merchant();
			merchant.setBusinessName("Siva Sai Enterprises");
			merchant.setBusinessType("kirana");
			merchant.setBusinessContactNo("303943");
			merchant.setBusinessEmailAddress("siva@gmail.com");
			merchant.setBusinessLicenseNo("n3o39446");
			merchant.setOwnerName("siva");
			merchant.setEstablishedDate(new Date());
			merchant.setStatus("approved");

			session.save(merchant);
			merchantTermsAndConditions = new MerchantTermsAndConditions();
			merchantTermsAndConditions.setEffectiveDate(new Date());
			merchantTermsAndConditions.setAnnualCharges(3930);
			merchantTermsAndConditions.setCommisionCharges(393);
			merchantTermsAndConditions.setDeliveryCharges(393);
			merchantTermsAndConditions.setJoiningCharges(9383);
			merchantTermsAndConditions.setMerchant(merchant);
			int merchantNo = (int) session.save(merchantTermsAndConditions);
			System.out.println("merchantNo : " + merchantNo);
			System.out.println("merchantTermsAndConditions : " + merchantTermsAndConditions.getMerchantNo());

			flag = true;
			
			merchantTermsAndConditions = session.get(MerchantTermsAndConditions.class, 1);
			System.out.println(merchantTermsAndConditions);
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}

	}
}
