package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Commentaire;

@Repository
public class CommentaireDAO implements IeasyPool<Commentaire> {

	private SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Commentaire com) {
		sessionFactory.getCurrentSession().save(com);
	}

	@Override
	public void delete(Commentaire com) {
		sessionFactory.getCurrentSession().delete(com);
		
	}

	@Override
	public Commentaire update(Commentaire com) {
		return ((CommentaireDAO) sessionFactory.getCurrentSession()).update(com);
	}

	@Override
	public Commentaire find(Commentaire com) {		
		return ((CommentaireDAO) sessionFactory.getCurrentSession()).find(com);
	}

}
