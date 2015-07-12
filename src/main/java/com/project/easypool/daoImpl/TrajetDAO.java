package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Trajet;

@Repository
public class TrajetDAO implements IeasyPool<Trajet> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Trajet trajet) {
		sessionFactory.getCurrentSession().save(trajet);
		
	}

	@Override
	public void delete(Trajet trajet) {
		sessionFactory.getCurrentSession().delete(trajet);
		
	}

	@Override
	public Trajet update(Trajet trajet) {
		
		return ((TrajetDAO)sessionFactory.getCurrentSession()).update(trajet);
	}

	@Override
	public Trajet find(Trajet trajet) {
		return ((TrajetDAO) sessionFactory.getCurrentSession()).find(trajet);
	}
	
}
