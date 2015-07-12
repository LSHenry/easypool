package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Profil;
import com.project.easypool.service.IeasyPoolService;

@Service
public class ProfilService implements IeasyPoolService<Profil> {

	
	private IeasyPool<Profil> dao;	

	@Autowired
	public void setDao(IeasyPool<Profil> dao) {
		this.dao = dao;
	}

	@Override
	public void save(Profil profil) {
		dao.save(profil);
		
	}

	@Override
	public void delete(Profil profil) {
		dao.delete(profil);
		
	}

	@Override
	public Profil update(Profil profil) {
		
		return dao.update(profil);
	}

	@Override
	public Profil find(Profil profil) {
		
		return dao.find(profil);
	}
	



}
