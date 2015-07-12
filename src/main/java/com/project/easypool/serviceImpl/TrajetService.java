package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Trajet;
import com.project.easypool.service.IeasyPoolService;

@Service
public class TrajetService implements IeasyPoolService<Trajet> {

	
	private IeasyPool<Trajet> dao;	

	@Autowired
	public void setDao(IeasyPool<Trajet> dao) {
		this.dao = dao;
	}
	

	@Override
	public void save(Trajet trajet) {
		dao.save(trajet);
	}

	@Override
	public void delete(Trajet trajet) {
		dao.delete(trajet);
		
	}

	@Override
	public Trajet update(Trajet trajet) {
		return dao.update(trajet);
	}

	@Override
	public Trajet find(Trajet trajet) {		
		return dao.find(trajet);
	}

}
