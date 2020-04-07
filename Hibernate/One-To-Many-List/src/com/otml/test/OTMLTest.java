package com.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otml.entities.Appointment;
import com.otml.entities.Patient;
import com.otml.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class OTMLTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Patient patient = null;
		Appointment appointment = null;
		List<Appointment> appointments = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			appointments = new ArrayList<>();
			
			appointment = new Appointment();
			appointment.setAppointmentDate(new Date());
			appointment.setDoctorName("Rajesh");
			appointment.setRemarks("Fever");
			appointment.setStatus("CNF");
			session.save(appointment);
			
			appointments.add(appointment);
			
			appointment = new Appointment();
			appointment.setAppointmentDate(new Date());
			appointment.setDoctorName("Ravi");
			appointment.setRemarks("Weakness");
			appointment.setStatus("CNF");
			session.save(appointment);
			appointments.add(appointment);
			
			patient = new Patient();
			patient.setPatientName("Rahul");
			patient.setAge(23);
			patient.setGender("Male");
			patient.setMobileNo("393840484");
			patient.setEmailAddress("rahul@yahoo.com");
			patient.setAppointments(appointments);
			session.save(patient);
			
			flag = true;
			
			patient = session.get(Patient.class, 1);
			System.out.println(patient);
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














