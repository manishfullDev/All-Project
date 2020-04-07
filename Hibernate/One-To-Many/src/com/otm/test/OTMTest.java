package com.otm.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.entities.Company;
import com.otm.entities.Job;
import com.otm.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class OTMTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Job job = null;
		Company company = null;
		Set<Job> jobs = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			jobs = new HashSet<>();

			job = new Job();
			job.setTitle("2Yr Java Developer");
			job.setDescription("Java Software Engineer");
			job.setOpenedDate(new Date());
			job.setCloseDate(new Date());
			job.setDesignation("Software Engineer");
			job.setExperience(2);
			session.save(job);

			jobs.add(job);

			job = new Job();
			job.setTitle("2Yr UI Developer");
			job.setDescription("Jquery/Angular Js");
			job.setOpenedDate(new Date());
			job.setCloseDate(new Date());
			job.setDesignation("Software Engineer");
			job.setExperience(2);
			session.save(job);
			jobs.add(job);

			company = new Company();
			company.setBusinessName("Albert Systems Pvt Ltd");
			company.setContactNo("393940");
			company.setEmailAddress("contactus@albert.com");
			company.setEstablishedDate(new Date());
			company.setHrRepresentativeName("aBC");
			company.setJobs(jobs);
			session.save(company);
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
