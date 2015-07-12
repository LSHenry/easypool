package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Etape;
import com.project.easypool.service.IeasyPoolService;

@Service /* la Couche Service*/
public class EtapeService implements IeasyPoolService<Etape> {

	private IeasyPool<Etape> dao;

	@Autowired 
	public void setDao(IeasyPool<Etape> dao) {
		this.dao = dao;
	}
	
	
	@Override
	public void save(Etape etape) {
		dao.save(etape);
	}


	@Override
	public void delete(Etape etape) {
		dao.delete(etape);
		
	}

	@Override
	public Etape update(Etape etape) {
		return dao.update(etape);
	}

	@Override
	public Etape find(Etape etape) {		
		return dao.find(etape);
	}

}
