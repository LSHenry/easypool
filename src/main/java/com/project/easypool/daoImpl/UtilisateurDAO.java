package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Utilisateur;

@Repository
public class UtilisateurDAO implements IeasyPool<Utilisateur> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Utilisateur user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void delete(Utilisateur user) {
		sessionFactory.getCurrentSession().delete(user);
		
	}

	@Override
	public Utilisateur update(Utilisateur user) {
		return ((UtilisateurDAO) sessionFactory.getCurrentSession()).update(user);
	}

	@Override
	public Utilisateur find(Utilisateur user) {		
		return ((UtilisateurDAO) sessionFactory.getCurrentSession()).find(user);
	}

}
