package com.shi.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.shi.entities.Company;

public class CompanyDao {
	private HibernateTemplate hibernateTemplate;

	public CompanyDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Company find(int companyNo) {
		return hibernateTemplate.get(Company.class, companyNo);
	}

	public List<Company> getCompanies(Date fromDate, Date toDate) {
		return (List<Company>) hibernateTemplate.find("from Company c where c.establishedDate between ? and ?",
				fromDate, toDate);
	}

	public List<Company> getAllCompanies() {
		return (List<Company>) hibernateTemplate.findByNamedQuery("getAllCompanies");
	}

	public int saveCompany(Company company) {
		return (int) hibernateTemplate.save(company);
	}

	public List<Company> getCompanies(int pageNo, int pageSize) {
		int startIndex = (pageSize * (pageNo - 1)) + 1;

		return hibernateTemplate.execute(new HibernateCallback<List<Company>>() {
			@Override
			public List<Company> doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery("from Company");
				query.setFirstResult(startIndex);
				query.setFetchSize(pageSize);

				return query.list();
			}
		});

	}
}
