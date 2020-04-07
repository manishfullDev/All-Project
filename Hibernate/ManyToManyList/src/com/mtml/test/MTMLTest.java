package com.mtml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.Auction;
import com.mtml.entities.Participant;
import com.mtml.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class MTMLTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Participant participant = null;
		Auction auction = null;
		List<Participant> participants = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			participants = new ArrayList<>();
			participant = new Participant();
			participant.setAge(35);
			participant.setContactNo("3994048");
			participant.setEmailAddress("joseph@gmail.com");
			participant.setGender("Male");
			participant.setParticipantName("Joseph");
			session.save(participant);
			participants.add(participant);
			
			participant = new Participant();
			participant.setAge(15);
			participant.setContactNo("32425994048");
			participant.setEmailAddress("samuel@gmail.com");
			participant.setGender("Male");
			participant.setParticipantName("samuel");
			session.save(participant);
			participants.add(participant);
			
			auction = new Auction();
			auction.setAuctionDate(new Date());
			auction.setAuctionTitle("Housing Scheme");
			auction.setDescription("Housing India Scheme");
			auction.setFees(3000);
			auction.setStatus("open");
			auction.setParticipants(participants);
			session.save(auction);
			
			flag = true;
			
			auction = session.get(Auction.class, 1);
			System.out.println(auction);
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










