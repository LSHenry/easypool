package com.project.easypool.service;

import java.util.List;
import com.project.easypool.entity.Commentaire;
import com.project.easypool.entity.Message;
import com.project.easypool.entity.Reservation;
import com.project.easypool.entity.Trajet;

public interface IEtudiantService {
	
	void afficherProfil();
	List <Commentaire> listerCommentaires(Trajet trajet);	
	List <Message> listerMessages();
	List <Reservation> listerReservations();
}
