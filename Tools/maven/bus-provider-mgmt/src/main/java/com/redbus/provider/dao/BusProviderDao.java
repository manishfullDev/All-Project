package com.redbus.provider.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.redbus.provider.bo.BusProviderBo;
import com.redbus.provider.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class BusProviderDao {

	public List<BusProviderBo> getBusProviders() {
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		TypedQuery<BusProviderBo> query = null;
		List<BusProviderBo> busProviderBos = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		query = session.createQuery(
				"select new com.redbus.provider.bo.BusProviderBo(bp.busProviderId,bp.businessName,bp.primaryBusinessContactNo,bp.primaryBusinessEmailAddress) from BusProviders bp order by bp.businessName",
				BusProviderBo.class);
		busProviderBos = query.getResultList();
		return busProviderBos;
	}
}
