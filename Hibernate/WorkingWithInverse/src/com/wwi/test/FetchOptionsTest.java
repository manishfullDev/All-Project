package com.wwi.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class FetchOptionsTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Member member = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		member = session.get(Member.class, 7);
		System.out.println("member Name : "+ member.getMemberName());
		Set<InsurancePolicy> insurancePolicies = member.getInsurancePolicies();
		System.out.println("set class : " + insurancePolicies.getClass().getName());
		
		for(InsurancePolicy ip : insurancePolicies) {
			System.out.println(ip.getPlanNo());
		}
	}

}

















