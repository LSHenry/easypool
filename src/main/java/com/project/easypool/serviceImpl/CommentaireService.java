package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.dao.IeasyPool;
import com.project.easypool.entity.Commentaire;
import com.project.easypool.service.IeasyPoolService;

@Service
public class CommentaireService implements IeasyPoolService<Commentaire> {

	
	private IeasyPool<Commentaire> dao;	


	@Autowired
	public void setDao(IeasyPool<Commentaire> dao) {
		this.dao = dao;
	}

	@Override
	public void save(Commentaire com) {
		dao.save(com);
	}

	@Override
	public void delete(Commentaire com) {
		dao.delete(com);
		
	}

	@Override
	public Commentaire update(Commentaire com) {
		return dao.update(com);
	}

	@Override
	public Commentaire find(Commentaire com) {		
		return dao.find(com);
	}

}
