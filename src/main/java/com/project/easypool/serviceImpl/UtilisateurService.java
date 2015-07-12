package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Utilisateur;
import com.project.easypool.service.IeasyPoolService;

@Service
public class UtilisateurService implements IeasyPoolService<Utilisateur> {

	
	private IeasyPool<Utilisateur> dao;	

	@Autowired
	public void setDao(IeasyPool<Utilisateur> dao) {
		this.dao = dao;
	}
	

	@Override
	public void save(Utilisateur utilisateur) {
		dao.save(utilisateur);
	}

	@Override
	public void delete(Utilisateur utilisateur) {
		dao.delete(utilisateur);
		
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		return dao.update(utilisateur);
	}

	@Override
	public Utilisateur find(Utilisateur utilisateur) {		
		return dao.find(utilisateur);
	}

}
