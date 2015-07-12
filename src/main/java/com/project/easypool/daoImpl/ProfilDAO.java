package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Profil;

@Repository
public class ProfilDAO implements IeasyPool<Profil> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Profil profil) {
		sessionFactory.getCurrentSession().save(profil);
	}

	@Override
	public void delete(Profil profil) {
		sessionFactory.getCurrentSession().delete(profil);
		
	}

	@Override
	public Profil update(Profil profil) {
		return ((ProfilDAO) sessionFactory.getCurrentSession()).update(profil);
	}

	@Override
	public Profil find(Profil profil) {		
		return ((ProfilDAO) sessionFactory.getCurrentSession()).find(profil);
	}

}
