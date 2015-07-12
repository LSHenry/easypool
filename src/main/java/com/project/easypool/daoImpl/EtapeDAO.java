package com.project.easypool.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Etape;

@Repository /* la couche DAO*/
public class EtapeDAO implements IeasyPool<Etape> {

	private SessionFactory sessionFactory;	/*Important toujours à déclarer */

	@Autowired  /*Important toujours à déclarer */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Etape etape) {
		sessionFactory.getCurrentSession().save(etape);
	}

	@Override
	public void delete(Etape etape) {
		sessionFactory.getCurrentSession().delete(etape);
		
	}

	@Override
	public Etape update(Etape etape) {
		return ((EtapeDAO) sessionFactory.getCurrentSession()).update(etape);
	}

	@Override
	public Etape find(Etape etape) {		
		return ((EtapeDAO) sessionFactory.getCurrentSession()).find(etape);
	}

}
