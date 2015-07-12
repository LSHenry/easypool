package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Reservation;

@Repository
public class ReservationDAO implements IeasyPool<Reservation> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Reservation resa) {
		sessionFactory.getCurrentSession().save(resa);
	}

	@Override
	public void delete(Reservation resa) {
		sessionFactory.getCurrentSession().delete(resa);
		
	}

	@Override
	public Reservation update(Reservation resa) {
		return ((ReservationDAO) sessionFactory.getCurrentSession()).update(resa);
	}

	@Override
	public Reservation find(Reservation resa) {		
		return ((ReservationDAO) sessionFactory.getCurrentSession()).find(resa);
	}

}
