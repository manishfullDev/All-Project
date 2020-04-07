package com.wwi.test;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wwi.bo.MemberContact;
import com.wwi.entities.InsurancePolicy;
import com.wwi.entities.Member;
import com.wwi.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class HQLTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		// showMembers(session);
		// showTypedMembers(session);
		// showMembersByGender(session, "Female");
		// showMembersByGenderAndDob(session, "Male", 2017, 2018);
		// showNoOfMembersByGender(session, "Male");
		// showMemberContactDetails(session);
		// showMemberContactDetailsInBo(session);
		// showNoOfMembersByGender(session);
		// showMemberInsurancePolicies(session, "susan");
		// showMembersOfAPlan(session, "pl30");
		//showMembersWithoutPolicies(session);
		showAllMembersUsingNamedQuery(session);

	}
	
	private static void showAllMembersUsingNamedQuery(Session session) {
		TypedQuery<Member> query = null;
		List<Member> members = null;
		
		query = session.getNamedQuery("allMembers");
		members = query.getResultList();
		printMembers(members);
	}

	private static void showMembers(Session session) {
		Query query = null;
		List<Member> members = null;

		query = session.createQuery("from Member");
		members = query.getResultList();
		printMembers(members);

	}

	private static void showTypedMembers(Session session) {
		TypedQuery<Member> query = null;
		List<Member> members = null;

		query = session.createQuery("from Member", Member.class);
		members = query.getResultList();
		printMembers(members);
	}

	private static void printMembers(List<Member> members) {
		for (Member member : members) {
			System.out.println(member);
		}
	}

	private static void showMembersByGender(Session session, String gender) {
		TypedQuery<Member> query = null;
		List<Member> members = null;

		query = session.createQuery("from Member m where m.gender like ?", Member.class);
		query.setParameter(0, gender);
		members = query.getResultList();
		printMembers(members);

	}

	private static void showMembersByGenderAndDob(Session session, String gender, int fromYear, int toYear) {
		TypedQuery<Member> query = null;
		List<Member> members = null;

		query = session
				.createQuery("from Member m where m.gender = :gender and year(m.dob) between :fromYear and :toYear",
						Member.class)
				.setParameter("gender", gender).setParameter("fromYear", fromYear).setParameter("toYear", toYear);
		members = query.getResultList();
		printMembers(members);
	}

	private static void showNoOfMembersByGender(Session session, String gender) {
		TypedQuery<Long> query = null;
		Long c = 0l;

		query = session.createQuery("select count(m) from Member m where m.gender like :gender", Long.class)
				.setParameter("gender", gender);
		c = query.getSingleResult();
		System.out.println("members by gender : " + gender + " count : " + c);
	}

	private static void showMemberContactDetails(Session session) {
		TypedQuery<Object[]> query = null;
		List<Object[]> records = null;

		query = session.createQuery(
				"select m.memberName, m.emailAddress, m.mobileNo from Member m order by m.memberName", Object[].class);
		records = query.getResultList();
		for (Object[] record : records) {
			System.out
					.println("meberName : " + record[0] + " emailAddress : " + record[1] + " mobileNo : " + record[2]);
		}
	}

	private static void showMemberContactDetailsInBo(Session session) {
		TypedQuery<MemberContact> query = null;
		List<MemberContact> memberContacts = null;

		query = session.createQuery(
				"select new com.wwi.bo.MemberContact(m.memberName, m.emailAddress, m.mobileNo) from Member m order by m.memberName",
				MemberContact.class);
		memberContacts = query.getResultList();
		for (MemberContact mc : memberContacts) {
			System.out.println(mc);
		}
	}

	private static void showNoOfMembersByGender(Session session) {
		TypedQuery<Object[]> query = null;
		List<Object[]> cl = null;

		query = session.createQuery("select count(m), m.gender from Member m group by m.gender", Object[].class);
		cl = query.getResultList();
		for (Object[] l : cl) {
			System.out.println("gender : " + l[1] + " count : " + l[0]);
		}
	}

	private static void showMemberInsurancePolicies(Session session, String memberName) {
		TypedQuery<InsurancePolicy> query = null;
		List<InsurancePolicy> insurancePolicies = null;

		/*
		 * query = session.
		 * createQuery("select ip from InsurancePolicy ip where ip.member.memberName like ?"
		 * , InsurancePolicy.class).setParameter(0, memberName);
		 */
		query = session
				.createQuery("select ip from InsurancePolicy ip inner join ip.member m where m.memberName like ?",
						InsurancePolicy.class)
				.setParameter(0, memberName);
		insurancePolicies = query.getResultList();
		for (InsurancePolicy policy : insurancePolicies) {
			System.out.println(policy.getEnrollmentNo());
		}
	}

	private static void showMembersOfAPlan(Session session, String planNo) {
		TypedQuery<Member> query = null;
		List<Member> members = null;

		query = session.createQuery("select m from Member m inner join m.insurancePolicies ip where ip.planNo = :plNo",
				Member.class).setParameter("plNo", planNo);
		members = query.getResultList();
		printMembers(members);
	}

	private static void showMembersWithoutPolicies(Session session) {
		TypedQuery<Member> query = null;
		List<Member> members = null;

		/*
		 * query = session.createQuery(
		 * "from Member m where m.memberNo not in (select ip.member.memberNo from InsurancePolicy ip)"
		 * , Member.class);
		 */

		/*
		 * query = session.createQuery(
		 * "from Member m where 0 = (select count(ip) from InsurancePolicy ip where ip.member.memberNo = m.memberNo)"
		 * , Member.class);
		 */
		/*query = session.createQuery(
				"select m from Member m left outer join m.insurancePolicies ip group by m.memberNo having count(ip.enrollmentNo) = 0",
				Member.class);*/
		query = session.createQuery("from Member m where size(m.insurancePolicies) = 0", Member.class);
		
		members = query.getResultList();
		printMembers(members);
	}
}
















