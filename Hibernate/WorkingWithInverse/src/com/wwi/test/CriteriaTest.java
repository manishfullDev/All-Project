package com.wwi.test;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class CriteriaTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		CriteriaQuery<Member> cQuery = null;
		CriteriaBuilder cb = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		// showMembers(session);
		// showMembersByGender(session, "Female");
		// showMembersByGenderAndDob(session, "Male", 2017, 2018);
		// showNoOfMembersByGender(session, "Male");
		// showMemberContactDetails(session);
		// showNoOfMembersByGender(session);
		// showMemberInsurancePolicies(session, "susan");
		showMembersOfAPlan(session, "pl30");
	}

	private static void showMembers(Session session) {
		CriteriaQuery<Member> cq = null;
		TypedQuery<Member> tq = null;
		CriteriaBuilder cb = null;
		List<Member> members = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Member.class);

		Root<Member> root = cq.from(Member.class);
		tq = session.createQuery(cq);
		members = tq.getResultList();
		printMembers(members);
	}

	private static void showMembersByGender(Session session, String gender) {
		CriteriaQuery<Member> cq = null;
		TypedQuery<Member> tq = null;
		CriteriaBuilder cb = null;
		List<Member> members = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Member.class);

		Root<Member> root = cq.from(Member.class);
		cq.where(cb.like(root.get("gender"), gender));
		tq = session.createQuery(cq);
		members = tq.getResultList();
		printMembers(members);
	}

	private static void showMembersByGenderAndDob(Session session, String gender, int fromYear, int toYear) {
		CriteriaQuery<Member> cq = null;
		TypedQuery<Member> tq = null;
		CriteriaBuilder cb = null;
		List<Member> members = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Member.class);

		Root<Member> root = cq.from(Member.class);
		cq.where(cb.and(cb.like(root.get("gender"), gender), cb.between(root.get("dob"), fromYear, toYear)));
		tq = session.createQuery(cq);
		members = tq.getResultList();
		printMembers(members);
	}

	private static void showNoOfMembersByGender(Session session, String gender) {
		CriteriaQuery<Long> cq = null;
		TypedQuery<Long> tq = null;
		CriteriaBuilder cb = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Long.class);

		Root<Member> root = cq.from(Member.class);
		cq.select(cb.count(root));
		cq.where(cb.like(root.get("gender"), gender));
		tq = session.createQuery(cq);
		Long c = tq.getSingleResult();
		System.out.println("members by gender : " + gender + " count : " + c);
	}

	private static void showMemberContactDetails(Session session) {
		CriteriaQuery<Tuple> cq = null;
		TypedQuery<Tuple> tq = null;
		CriteriaBuilder cb = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Tuple.class);

		Root<Member> root = cq.from(Member.class);
		cq.multiselect(root.get("memberName"), root.get("emailAddress"), root.get("mobileNo"));

		tq = session.createQuery(cq);
		List<Tuple> records = tq.getResultList();
		for (Tuple record : records) {
			System.out.println(record.get(0) + " - " + record.get(1) + " - " + record.get(2));
		}
	}

	private static void showNoOfMembersByGender(Session session) {
		CriteriaQuery<Tuple> cq = null;
		TypedQuery<Tuple> tq = null;
		CriteriaBuilder cb = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Tuple.class);

		Root<Member> root = cq.from(Member.class);
		cq.multiselect(root.get("gender"), cb.count(root)).groupBy(root.get("gender"));
		tq = session.createQuery(cq);
		List<Tuple> records = tq.getResultList();

		for (Tuple record : records) {
			System.out.println(record.get(0) + " - " + record.get(1));
		}
	}

	private static void showMemberInsurancePolicies(Session session, String memberName) {
		CriteriaQuery<InsurancePolicy> cq = null;
		TypedQuery<InsurancePolicy> tq = null;
		CriteriaBuilder cb = null;
		List<InsurancePolicy> insurancePolicies = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(InsurancePolicy.class);
		Root<InsurancePolicy> root = cq.from(InsurancePolicy.class);
		cq.where(cb.like(root.get("member").get("memberName"), memberName));
		tq = session.createQuery(cq);
		insurancePolicies = tq.getResultList();
		for (InsurancePolicy ip : insurancePolicies) {
			System.out.println(ip.getPlanNo());
		}
	}

	private static void showMembersOfAPlan(Session session, String planNo) {
		CriteriaQuery<Member> cq = null;
		TypedQuery<Member> tq = null;
		CriteriaBuilder cb = null;
		List<Member> members = null;

		cb = session.getCriteriaBuilder();
		cq = cb.createQuery(Member.class);
		Root<Member> root = cq.from(Member.class);

		cq.where(cb.like(root.join("insurancePolicies").get("planNo"), planNo));
		tq = session.createQuery(cq);
		members = tq.getResultList();
		printMembers(members);
	}

	private static void printMembers(List<Member> members) {
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
