package com.wwi.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class NPlusOneProblemTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Member member = null;
		Set<InsurancePolicy> insurancePolicies = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		Query<Member> query = session.createQuery("from Member");
		List<Member> members = query.list();
		
		for(Member m : members) {
			System.out.println("m no : " + m.getMemberName());
			insurancePolicies = m.getInsurancePolicies();
			for(InsurancePolicy policy : insurancePolicies) {
				System.out.println("e no : " + policy.getEnrollmentNo());
			}
		}
		
	}
}
















