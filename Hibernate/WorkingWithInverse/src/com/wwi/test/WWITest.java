package com.wwi.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class WWITest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Member member = null;
		InsurancePolicy insurancePolicy1 = null;
		InsurancePolicy insurancePolicy2 = null;
		Set<InsurancePolicy> insurancePolicies = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			insurancePolicies = new HashSet<>();
			member = new Member();
			member.setMemberName("Robert");
			member.setDob(new Date());
			member.setGender("Male");
			member.setMobileNo("9398393894");
			member.setEmailAddress("robert@gmail.com");
			session.save(member);
			
			insurancePolicy1 = new InsurancePolicy();
			insurancePolicy1.setPlanNo("pl30");
			insurancePolicy1.setPolicyEffectiveDate(new Date());
			insurancePolicy1.setPolicyExpiryDate(new Date());
			insurancePolicy1.setSumInsurred(200000);
			insurancePolicy1.setStatus("A");
			insurancePolicy1.setMember(member);
			insurancePolicies.add(insurancePolicy1);
			session.save(insurancePolicy1);
			
			
			insurancePolicy1 = new InsurancePolicy();
			insurancePolicy1.setPlanNo("pl123");
			insurancePolicy1.setPolicyEffectiveDate(new Date());
			insurancePolicy1.setPolicyExpiryDate(new Date());
			insurancePolicy1.setSumInsurred(500000);
			insurancePolicy1.setStatus("A");
			insurancePolicy1.setMember(member);
			insurancePolicies.add(insurancePolicy1);
			session.save(insurancePolicy1);
			
			member.setInsurancePolicies(insurancePolicies);
			
			flag = true;
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

