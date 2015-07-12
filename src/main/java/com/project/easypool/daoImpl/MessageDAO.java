package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Message;

@Repository
public class MessageDAO implements IeasyPool<Message> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Message mes) {
		sessionFactory.getCurrentSession().save(mes);
	}

	@Override
	public void delete(Message mes) {
		sessionFactory.getCurrentSession().delete(mes);
		
	}

	@Override
	public Message update(Message mes) {
		return ((MessageDAO) sessionFactory.getCurrentSession()).update(mes);
	}

	@Override
	public Message find(Message mes) {		
		return ((MessageDAO) sessionFactory.getCurrentSession()).find(mes);
	}

}
