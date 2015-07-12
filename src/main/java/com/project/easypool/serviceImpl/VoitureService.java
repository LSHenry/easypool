package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Voiture;
import com.project.easypool.service.IeasyPoolService;

@Service
public class VoitureService implements IeasyPoolService<Voiture> {

	
	private IeasyPool<Voiture> dao;	

	@Autowired
	public void setDao(IeasyPool<Voiture> dao) {
		this.dao = dao;
	}
	

	@Override
	public void save(Voiture voiture) {
		dao.save(voiture);
	}

	@Override
	public void delete(Voiture Voiture) {
		dao.delete(Voiture);
		
	}

	@Override
	public Voiture update(Voiture voiture) {
		return dao.update(voiture);
	}

	@Override
	public Voiture find(Voiture voiture) {		
		return dao.find(voiture);
	}

}
