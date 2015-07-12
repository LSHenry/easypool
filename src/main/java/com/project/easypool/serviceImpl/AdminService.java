package com.project.easypool.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.easypool.daoImpl.UtilisateurDAO;
import com.project.easypool.service.IAdminService;

@Service
public class AdminService implements IAdminService {
	
	private UtilisateurDAO utilisateurDAO;
	
	@Autowired
	public void setUtilisateurDAO(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	@Override
	public void analyseEtudiants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void analyseTrajets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void analyseReservations() {
		// TODO Auto-generated method stub
		
	}	
		
}
