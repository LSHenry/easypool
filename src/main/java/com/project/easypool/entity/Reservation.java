package com.project.easypool.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Reservation implements Serializable {
	
	@Id
	@GeneratedValue
	private int idReservation;
	private Date dateCreation;
	private Date dateModification;
	private String codeReservation;
	
	@ManyToOne
	private Utilisateur passager;
	
	@ManyToOne
	private Trajet trajet;
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Reservation() {
		super();
	}
	
	public Reservation(Date dateCreation, Date dateModification,
			String codeReservation, Utilisateur passager, Trajet trajet) {
		super();
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.codeReservation = codeReservation;
		this.passager = passager;
		this.trajet = trajet;
	}
	
	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////
	
	public Date getDateCreation() {
		return dateCreation;
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public String getCodeReservation() {
		return codeReservation;
	}

	public Utilisateur getPassager() {
		return passager;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public void setCodeReservation(String codeReservation) {
		this.codeReservation = codeReservation;
	}

	public void setPassager(Utilisateur passager) {
		this.passager = passager;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation
				+ ", dateCreation=" + dateCreation + ", dateModification="
				+ dateModification + ", codeReservation=" + codeReservation
				+ ", passager=" + passager + ", trajet=" + trajet + "]";
	}
}
