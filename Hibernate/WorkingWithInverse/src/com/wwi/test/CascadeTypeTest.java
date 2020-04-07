package com.wwi.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class CascadeTypeTest {
	public static void main(String[] args) {
		// deleteMember();
		evict();
	}

	public static void evict() {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Member member = null;
		Set<InsurancePolicy> insurancePolicies = null;
		InsurancePolicy policy = null;
		
		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		member = session.get(Member.class, 8);
		/*insurancePolicies = member.getInsurancePolicies();
		
		for(InsurancePolicy p : insurancePolicies) {
			System.out.println(p.getEnrollmentNo());
		}*/
		session.evict(member);
		System.out.println("after evict()");
		policy = session.get(InsurancePolicy.class, 10);

	}

	public static void deleteMember() {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Member member = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			member = session.get(Member.class, 7);
			Set<InsurancePolicy> insurancePolicies = member.getInsurancePolicies();
			Iterator<InsurancePolicy> it = insurancePolicies.iterator();
			while (it.hasNext()) {
				it.next();
				it.remove();
			}
			session.update(member);
			// session.delete(member);
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

	public static void save() {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Member member = null;
		InsurancePolicy insurancePolicy1 = null;
		InsurancePolicy insurancePolicy2 = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			member = new Member();
			member.setMemberName("Steve");
			member.setDob(new Date());
			member.setGender("Male");
			member.setMobileNo("387938");
			member.setEmailAddress("steve@gmail.com");

			insurancePolicy1 = new InsurancePolicy();
			insurancePolicy1.setPlanNo("pl30");
			insurancePolicy1.setPolicyEffectiveDate(new Date());
			insurancePolicy1.setPolicyExpiryDate(new Date());
			insurancePolicy1.setSumInsurred(200000);
			insurancePolicy1.setStatus("A");
			insurancePolicy1.setMember(member);
			session.save(insurancePolicy1);

			insurancePolicy2 = new InsurancePolicy();
			insurancePolicy2.setPlanNo("pl123");
			insurancePolicy2.setPolicyEffectiveDate(new Date());
			insurancePolicy2.setPolicyExpiryDate(new Date());
			insurancePolicy2.setSumInsurred(500000);
			insurancePolicy2.setStatus("A");
			insurancePolicy2.setMember(member);
			session.save(insurancePolicy2);

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
