package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Voiture;

@Repository
public class VoitureDAO implements IeasyPool<Voiture> {
	
	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Voiture car) {
		sessionFactory.getCurrentSession().save(car);
	}

	@Override
	public void delete(Voiture car) {
		sessionFactory.getCurrentSession().delete(car);
		
	}

	@Override
	public Voiture update(Voiture car) {
		return ((VoitureDAO) sessionFactory.getCurrentSession()).update(car);
	}

	@Override
	public Voiture find(Voiture car) {		
		return ((VoitureDAO) sessionFactory.getCurrentSession()).find(car);
	}

}
